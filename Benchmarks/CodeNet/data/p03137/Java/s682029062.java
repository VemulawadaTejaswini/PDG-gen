

import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] y= new int[m];
		
		int ans=0;
		
		if(m==1){
			System.out.println(ans);
			System.exit(0);
		}
		
		for(int i=0;i<m;i++){
			y[i]=sc.nextInt();
		}
		Arrays.sort(y);
		
		int[] x= new int [m-1];
		
				
		for(int i=0;i<m-1;i++){
			x[i]=y[i+1]-y[i];
			ans=ans+x[i];
		}
		
		Arrays.sort(x);

		
		
		for(int i=0; i<n-1;i++){
			ans=ans-x[m-i-2];
		}
		
		System.out.println(ans);
	}

}
