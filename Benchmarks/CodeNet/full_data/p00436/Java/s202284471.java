import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] c = new int[2*n];
		int[] d = new int[2*n];
		
		for(int i=0;i<2*n;i++) c[i] = i+1;
		
		int k = 0;
		for(int i=0;i<m;i++){
			k = sc.nextInt();
			if(k==0){
				for(int j=0;j<n;j++) d[j] = c[n+j];
				for(int j=n-1;j>=0;j--) c[2*j] = c[j];
				for(int j=n-1;j>=0;j--) c[2*j+1] = d[j];
			}else{
				for(int j=0;j<k;j++) d[j] = c[j];
				for(int j=k;j<2*n;j++) c[j-k] = c[j];
				for(int j=0;j<k;j++) c[2*n-k+j] = d[j];
			}
		}
		for(int i=0;i<2*n;i++) System.out.println(c[i]);	
	}	
}