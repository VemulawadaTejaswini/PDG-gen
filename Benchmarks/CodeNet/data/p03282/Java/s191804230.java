import java.util.Scanner;

public class Main {
	static long S,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.nextLong();
		K = sc.nextLong();

		String s = String.valueOf(S);
		String[] sarray = s.split("");
		String ans = "1";
		for (int i = 0; i < sarray.length; i++) {
			if (!sarray[i].equals("1")) {
				ans = (sarray[i]);
				break;
			}
		}
		System.out.println(ans);
	}
}