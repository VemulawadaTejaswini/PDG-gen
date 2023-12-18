import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		String s = sc.next();

		sc.close();

		if(N % 2 == 1) {
			System.out.println("No");
			return;
		}

		System.out.println(s.substring(0, N / 2).equals(s.substring(N / 2, N)) ? "Yes" : "No");
//		System.out.println(s.substring(N / 2, N));

//		System.out.println(s.substring(N / 2, N));
//		FastScanner fs = new FastScanner();
//		int N = fs.nextInt();


	}
}

