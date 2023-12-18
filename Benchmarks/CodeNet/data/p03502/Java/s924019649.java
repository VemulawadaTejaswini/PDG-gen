import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int tmpN = N;
		int fN = 0;
		for (int i = 8; i >= 0; i--) {
			fN += Math.floor(N / Math.pow(10, i));
			N -= (int)(fN * Math.pow(10, i));
		}
		if(tmpN%fN==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
