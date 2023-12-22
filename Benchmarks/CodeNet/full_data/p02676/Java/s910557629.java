import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		String S = scan.next();
		char[] X = S.toCharArray();
		if(X.length<=K) {
			System.out.println(S);
			
		}else {
			for(int i=0;i<K;i++) {
				System.out.print(X[i]);
				
			}
			System.out.print("...");
		}
	}

}
