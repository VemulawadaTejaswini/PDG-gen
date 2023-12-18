import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "";
		for(int i=0; i<S.length(); i++) {
			if(i % 2 == 0) {
				ans += S.charAt(i);
			} else {
				;
			}
		}
		System.out.println(ans);
	}

}
