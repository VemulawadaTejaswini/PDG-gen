import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] cs =  S.toCharArray();
		String ans = "Good";
		for(int i = 0; i< cs.length - 1; i++) {
			if (cs[i] == cs[i + 1]) {
				ans = "Bad";
			}
		}
		System.out.println(ans);

	}

}
