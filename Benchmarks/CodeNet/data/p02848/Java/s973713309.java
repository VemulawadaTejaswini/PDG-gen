import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		StringBuilder sb = new StringBuilder();

		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i=0;i < S.length();i++) {
			int s =a.indexOf(S.substring(i,i+1));
				sb.append(a.substring(s+N , s+N+1));
		}
		System.out.println(sb);

	}
}
