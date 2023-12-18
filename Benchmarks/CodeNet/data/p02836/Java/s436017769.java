import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int n = 0;
		for(int i=0; i<S.length()/2; i++) {
			if(S.charAt(i) != S.charAt(S.length()-1-i)) {
				n++;
			}
		}
		System.out.println(n);
	}

}