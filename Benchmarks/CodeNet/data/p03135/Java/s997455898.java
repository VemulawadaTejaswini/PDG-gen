import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int T = Integer.parseInt(s.split(" ")[0]);
		int X = Integer.parseInt(s.split(" ")[1]);

		Double ans = (double)T/(double)X;

		System.out.println(ans);
	}

}