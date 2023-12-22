import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] ss = S.split("");
		String[] tt = T.split("");
		int res = 0;
		for (int i = 0; i < ss.length; i++) {
			if (!ss[i].equals(tt[i])) {
				res++;
			}
		}
		System.out.println(res);
	}
}