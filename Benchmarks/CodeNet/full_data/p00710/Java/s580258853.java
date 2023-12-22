
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int r = sc.nextInt();
			int[] a = new int[n+1];
			if(r+n==0)break;
			for(int j=1;j<=n;j++) {
					a[n-j] = j;
			}
 			while(r-- != 0) {
 				int p = sc.nextInt()-1;
				int c = sc.nextInt();
				int[] b = new int[p];
				for(int i=0;i<p;i++)b[i] = a[i];
				for(int i=0;i<c;i++)a[i] = a[i+p];
				for(int i=0;i<p;i++)a[i+c] = b[i];	
			}
 			System.out.println(a[0]);
		}
		
	}
}
