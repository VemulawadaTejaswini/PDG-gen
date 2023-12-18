import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		long B = s.nextLong();
		long N = s.nextLong();
	
		long ans =0;
	
		for(int k=0; k<=(A*N)/B; k++) {
			int minn = (int)(Math.ceil((double)(B*k)/(double)A)); 
			if( k - (A*(minn/B)) > ans) {
				ans = k -A*(minn/B);
			
			}
			
		}
		System.out.println(ans);
	
	}
}
