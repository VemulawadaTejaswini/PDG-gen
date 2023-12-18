import java.util.Scanner;
public class Main{
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		Boolean M = true;
		char[] C = new char[S.length()];
		for(int i=0;i<S.length();i++) {
			C[i] = S.charAt(i);
			if(i == A && C[i] != '-') {
				M = false;
			}
			if(i != A && C[i] == '-') {
				M = false;
			}
		}
		if(M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}