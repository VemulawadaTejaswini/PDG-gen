import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = null;

		if(n>=1000) {
			ans="ABD";
			n=n-1000;
		}

		else {
			ans="ABC";
		}


System.out.println(ans);






	}
}