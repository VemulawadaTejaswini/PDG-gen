import java.util.Scanner;
public class Main{


	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		if(n==1) {
			System.out.println(2);
			return;
		}
		
		long[]l = new long[n+1];
		
		
		
		
		l[0] = 2;
		l[1] = 1;

		long ans = 0;
		
		for(int i = 2; i < n+1; i++) {
			l[i] = l[i-1] + l[i-2];
			ans = l[i];
			//System.out.println(ans);
		}

	if(n == 2) {
		System.out.println(1);
	}else {
		System.out.println(ans);
	}
		
	}

}
