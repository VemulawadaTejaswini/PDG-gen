import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++) a[j] = sc.nextInt();
			
			if(n-k<=0){
				System.out.println(0);
			}else{
				int[] b = new int[n-1];
				for(int j=0;j<n-1;j++) b[j] = a[j+1]-a[j];
				Arrays.sort(b);
				int r = a[n-1]-a[0];
				for(int j=1;j<k;j++) r-=b[n-1-j];
				System.out.println(r);
			}
		}
	}	
}