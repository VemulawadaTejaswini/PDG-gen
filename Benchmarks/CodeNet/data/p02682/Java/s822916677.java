import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long A = s.nextInt();
		long B = s.nextInt();
		long C = s.nextInt();
		long K = s.nextInt();
		
		long ans =0;
		
		if(K <= A) {ans =K;}
		else if(K <= A+B) {ans = A;}
		else {ans = A-(K-A-B);}
		
		System.out.println(ans);
	}

}
