import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int n;(n=sc.nextInt())!=0;){
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j]=sc.nextInt();
			
			int[][] b=new int[n][n];
			for(int i=0;i<n;i++){
				int min=-1;
				for(int j=0;j<n;j++)
					if(min==-1 || a[i][j]<min)
						min=a[i][j];
				for(int j=0;j<n;j++)
					if(a[i][j]==min)
						b[i][j]++;
			}
			for(int j=0;j<n;j++){
				int max=-1;
				for(int i=0;i<n;i++)
					if(max==-1 || a[i][j]>max)
						max=a[i][j];
				for(int i=0;i<n;i++)
					if(a[i][j]==max)
						b[i][j]++;
			}
			
			int res=0;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(b[i][j]==2)
						res=a[i][j];
			
			System.out.println(res);
		}
	}
}