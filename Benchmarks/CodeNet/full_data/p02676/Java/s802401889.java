import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		int K = scan.nextInt();
		
		if(S.length() <= K) {
			System.out.println(S);
		}else {
			String S2 = S.substring(0,K);
			System.out.println(S2+"...");
		}

	}

}