import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		String S = scan.next();
		String result = null;

		if(S.length()>K) {
			result = S.substring(0,K)+"...";
		}else {
			result = S;
		}

		System.out.println(result);

	}
}