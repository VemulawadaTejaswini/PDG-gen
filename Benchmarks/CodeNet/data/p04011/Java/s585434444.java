import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt(),y = scan.nextInt();
		if(n<=k){
			System.out.println(x*n);
		} else {
			System.out.println(x*k+y*(n-k));
		}
 	}

}