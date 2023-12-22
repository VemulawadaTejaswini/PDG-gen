import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		int x = in.nextInt();
		list.add(x);
		int y = in.nextInt();
		list.add(y);
		int max = y-x;
		for (int i = 2; i < n; i++) {
			int k = in.nextInt();
			list.add(k);
			for(int j = 0; j< i;j++){
				int t = k-list.get(j);
				if(max < t){
					max = t;
				}
			}
		}

		System.out.println(max);
	}
}