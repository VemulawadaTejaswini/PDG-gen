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
			
			for(int k=-xmax;k<xmax;k++) {
				//a=x[i]-x[k];
				for(int l=-ymax;l<ymax;l++) {
					//b=y[i]-y[k];
					tempcost=1;
					
					for(int j=0;j<N-1;j++) {
						if(x[j+1]==x[j]-k&&y[j+1]==y[j]-l) {
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
		
		
		System.out.println(cost);
		
		
		
	}

	
}
		
