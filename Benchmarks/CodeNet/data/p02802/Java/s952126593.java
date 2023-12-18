import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p= new int[M];
		String[] S = new String[M];
		int A = 0;
		int W = 0;
		int wmemo = 0; //waの個数のメモ
		if(M == 0) {
			System.out.println(0 + " " + 0);
		}
		else if(M > 0) {
			for(int i = 0; i < M; i++) {
				p[i] = sc.nextInt();
				S[i] = sc.next();
			}
			int pmemo = p[0]; //今見ているpの番号のメモ
		for(int i = 0; i < M; i++) {
			if(S[i].equals("AC") && pmemo == p[i]) {
				A++;
				W = W + wmemo;
				wmemo = 0;
				pmemo++;
			}
			else if(S[i].equals("WA") && pmemo == p[i]) {
				wmemo++;
			}
		}
		System.out.println(A + " " + W);
		}

	}
}