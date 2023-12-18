import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n,k;
		int i;
		int jj=0;
		int ans=100;
			
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			k=sc.nextInt();
			int []h=new int[n];
			for(i=0;i<n;i++) {
				h[i]=sc.nextInt();
			}
			Arrays.sort(h);
			for(i=0;i<n-k+1;i++) {
				jj=h[i+k-1]-h[i] ;
				if(jj<ans) {
					ans=jj;
				}
			}
			System.out.println(ans);
	}
}
