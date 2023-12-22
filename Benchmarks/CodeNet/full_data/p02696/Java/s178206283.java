import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		long B = s.nextLong();
		long N = s.nextLong();
		
		long maxfanc=0;
		/*
		for(long x=0; x<=N; x++) {
			if((A*x)/B - A*(x/B) > maxfanc) {
				maxfanc = (A*x)/B - A*(x/B);
						
			}
		}
		System.out.println(maxfanc);*/
		long ans =0;
		for(int k=0; k<=(A*N)/B; k++) {
			int minn = (int)(Math.ceil((double)(B*k/A))); 
			if( k - minn/B > ans) {
				ans = k -minn/B;
			}
			
		}
		System.out.println(ans);
	}

}
