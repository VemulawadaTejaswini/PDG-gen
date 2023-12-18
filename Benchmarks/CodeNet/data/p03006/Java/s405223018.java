import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] x=new int[N];
		int[] y=new int[N];
		
		int cost=1;
		int a=0,b=0;
		
		boolean init=false;
		
		int xmax=0;
		int ymax=0;
		
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			if(x[i]>xmax) {
				xmax=x[i];
			}
			if(y[i]>ymax) {
				ymax=y[i];
			}
			
		}
		
		
		
		int tempcost;
		
		
		for(int i=0;i<N-1;i++) {
			
			for(int k=0;k<N;k++) {
				a=x[i]-x[k];
				for(int m=0;m<N;m++) {
					for(int l=0;l<N;l++) {
						b=y[m]-y[l];
						tempcost=1;
						
						for(int j=0;j<N-1;j++) {
							if(x[j+1]==x[j]-a&&y[j+1]==y[j]-b) {
								continue;
							}
								tempcost++;
							
							
						}
						
						if(tempcost<cost||init==false) {
							cost=tempcost;
							init = true;
						}
						
						
					}
					
				}
				
			}
			
			
			
			
		}
		
		for(int i=0;i<N-1;i++) {
			

			a=x[i];
			for(int m=0;m<N;m++) {
				
					b=y[m];
					tempcost=1;
					
					for(int j=0;j<N-1;j++) {
						if(x[j+1]==x[j]-a&&y[j+1]==y[j]-b) {
							continue;
						}
							tempcost++;
						
						
					}
					
					if(tempcost<cost||init==false) {
						cost=tempcost;
						init = true;
					}
					
					
				}
				
			
			
		
		
		
		
		
	}
		
		System.out.println(cost);
	}
}