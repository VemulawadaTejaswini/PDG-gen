import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String n;
		LinkedList<String> S = new LinkedList<>();
		for(int i = 0; i<N; i++) {
			n = scan.next();
			if(S.contains(n)==false) {
				S.add(n);
			}
		}


		System.out.println(S.size());

	}
}
