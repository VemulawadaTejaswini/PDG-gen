import java.util.*;
public class Main {
static Scanner inp=new Scanner(System.in);
static int a[]=new int[100000];
static int ans[][]=new int[1000][1000];
	static int max(int x,int y){
		if (x>y)return(x);
		return(y);
	}
	public static void main(String[] args) {
		int n=inp.nextInt();
		while (n>0){
			for(int i=1;i<=n;i++)a[i]=inp.nextInt();
			for(int i=1;i<=n;i++)
				for (int j=i;j<=n;j++)
					ans[i][j]=-10000000;
			for (int j=1;j<n;j++)
			    for(int i=1;i+j<=n;i++){
					for (int h=i+1;h<i+j;h++)
						ans[i][j+i]=max(ans[i][h]+ans[h+1][i+j],ans[i][i+j]);
					if (Math.abs(a[i]-a[i+j])<2) ans[i][i+j]=max(ans[i+1][i+j-1]+2,ans[i][j+i]);
				}
			for (int j=1;j<n;j++)
			    for(int i=1;i+j<=n;i++)
					for (int h=i+1;h<i+j;h++){
						ans[i][i+j]=max(max(ans[i][i+j],0),max(ans[i+1][i+j],max(ans[i][i+j-1],ans[i][h]+ans[h+1][i+j])));
				}
			System.out.println(ans[1][n]);
			n=inp.nextInt();
		}
			
	}

}