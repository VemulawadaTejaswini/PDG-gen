import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	
	String S, T;
	S = sc.next(); 
	T = sc.next();

	char[] c_S = S.toCharArray();
	char[] c_T = T.toCharArray();

	String ans = String.valueOf(c_S[0]) + String.valueOf(c_T[0]);
	for (int i = 1; i < N; i++) {
	    ans += String.valueOf(c_S[i]);
	    ans += String.valueOf(c_T[i]);
	}

	System.out.println(ans);
    }
}