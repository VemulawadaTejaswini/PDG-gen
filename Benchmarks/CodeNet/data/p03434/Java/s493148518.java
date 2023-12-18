import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		Collections.sort(list, Collections.reverseOrder());
		int count = 0;
		int alice = 0;
		int bob = 0;
		for(int i = 0; i < list.size(); i++) {
			if(count % 2 == 0) {
				alice += list.get(i);
			}else {
				bob += list.get(i);
			}
			count++;
		}
		int ans = alice - bob;
		System.out.println(ans);
	}
}