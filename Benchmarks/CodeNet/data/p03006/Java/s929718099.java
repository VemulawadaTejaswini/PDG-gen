


import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] x=new int[N];
		int[] y=new int[N];
		
		int cost=1;
		int a=0,b=0;
		
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<N-1;i++) {
			int tempcost=1;
			for(int k=i+1;k<N;k++) {
				a=x[i]-x[k];
				for(int l=i+1;l<N;l++) {
					b=y[i]-y[k];
					for(int j=0;j<N-1;j++) {
						if(x[j+1]==x[j]-a&&y[j+1]==y[j]-b) {
							continue;
						}
							tempcost++;
						
						
					}
					
				}
				
			}
			
			
			if(tempcost<cost||i==0) {
				cost=tempcost;
			}
			
			
		}
		
		
		System.out.println(cost);
		
		
		
	}

	
}