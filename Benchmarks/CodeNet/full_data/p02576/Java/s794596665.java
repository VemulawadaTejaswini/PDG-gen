import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//test
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int X = Integer.parseInt(s[1]);
		int T = Integer.parseInt(s[2]);

		System.out.println(( N / X ) * (T+1));
	}

}
