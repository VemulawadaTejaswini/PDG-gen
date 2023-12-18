import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = "";
		sc.close();
		for(int i=0; i<S.length(); i++) {
			char a = S.charAt(i);
			a += N;
			if ('Z' < a) {
                a -= 26;
            }
			T += (char)a;
		}
		System.out.println(T);
	}

}