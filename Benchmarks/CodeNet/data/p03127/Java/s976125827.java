import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int M=sc.nextInt();
		int ans=M;
	for (int i = 1; i < N; i++) {
				int X = sc.nextInt();
			ans=GCD(ans,X);
	}
			

					System.out.print(ans); 	

	}
	public static int GCD(int a,int b) {
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		int r=-1;
		while(r!=0) {
			r=a%b;
			a=b;
			b=r;
					
		}
      return a;
	}
}


