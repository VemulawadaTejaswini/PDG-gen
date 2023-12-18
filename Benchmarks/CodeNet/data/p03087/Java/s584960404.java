
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		char[] list = sc.next().toCharArray();
		List<Integer> pos = new ArrayList<>();
		boolean flag = false;
		for(int i = 0; i < list.length; i++) {
			if(flag) {
				if(list[i] == 'C') {
					pos.add(i);
				}
				flag = false;
			} else {
				if(list[i] == 'A') {
					flag = true;
				}
			}
		}
		String ans = "";

		for(int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int count = 0;
			List<Integer> tmp = new ArrayList<>(pos);
			while(!tmp.isEmpty()) {
				int position = tmp.get(0);
				if(l <= position && position + 1 <= r) {
					count++;
				}
				tmp.remove(0);
			}
			ans = ans + count + "\n";
		}
		System.out.print(ans);
	}

}
