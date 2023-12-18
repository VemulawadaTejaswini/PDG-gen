import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		int x[]=new int[w+1];
		int y[]=new int[h+1];
		int range[]=new int[h+1];
		Arrays.fill(range, 1);
		int grid[][]=new int[w+1][h+1];
		for(int i=0;i<=w;++i) {
			Arrays.fill(grid[i],0);
		}
		for( int i=1;i<=n;++i) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			grid[x[i]][y[i]]=1;
		}
		int min=w;
		for(int i=1;i<w;++i) {
			for(int k=1;k<=range[i];++k) {
				if(grid[i][k]==1) {
					min=i-1;
					break;
				}
			}
			if(min==i-1)break;
			
			if(grid[i+1][range[i]]==1) {
				min=i;
				break;
			}
			else if(grid[i+1][range[i]]==0 && grid[i+1][range[i]+1]==0)range[i+1]=range[i]+1;
			else range[i+1]=range[i];
		}
		
		System.out.println(min);
	}
	

}
