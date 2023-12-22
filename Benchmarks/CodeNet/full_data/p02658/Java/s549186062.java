import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Long> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Long.parseLong(sc.next()));
		}
		sc.close();

		long ans = 1;
		long check = 1000000000000000000L;
		for(int i = 0; i < list.size(); i++) {
			ans *= list.get(i);
		}
		if(ans > check) {
			System.out.println(-1);
		}else if(ans == -9223372036854775808L) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
	}

}