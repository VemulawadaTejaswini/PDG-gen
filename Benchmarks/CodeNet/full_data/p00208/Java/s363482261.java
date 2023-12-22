import java.util.Scanner;

public class Main {

	static int[] b = {0,1,2,3,5,7,8,9};
	
	static void enc(int n){
		if(n>=8){
			enc(n/8);
		}
		System.out.print(b[n%8]);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			enc(n);
			System.out.println();
		}
	}
}