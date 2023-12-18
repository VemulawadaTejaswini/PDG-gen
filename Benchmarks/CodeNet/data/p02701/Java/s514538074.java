
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int x;
		int y;
		int z;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
//		String n;
		ArrayList<String> S = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			String n = scan.next();
			if(S.contains(n)==false) {
				S.add(n);
			}
		}

		System.out.println(S.size());

	}
}
