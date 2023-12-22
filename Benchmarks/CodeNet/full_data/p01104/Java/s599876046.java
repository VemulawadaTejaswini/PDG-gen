import java.util.*;
public class D {
	static int[] mrk=new int[5000000];
	static int[][] stk=new int[4000000][2];
	static int[] a=new int[1000];
	static int l[]=new int[2];
	static int fl=0;
	static int bdf(int x,int l,int n){
		int y=0;
		for(int i=0;i<l;i++)
			for (int j=1;j<=n;j++)
				if (mrk[stk[i][fl%2]^a[j]]==0){
					if((stk[i][fl%2]^a[j])==x) return(fl+1);
					mrk[stk[i][fl%2]^a[j]]=1;
					stk[y][(fl+1)%2]=stk[i][fl%2]^a[j];
					y++;
				}
		fl++;
		return(bdf(x,y,n));
	}
	static int check(int x,int[][] c,int n,int m){
		int y=1;
		int res=0;
		int[] a=new int [100];
		for (int j=1;j<=m;j++)a[j]=0;
		for (int i=1;i<=n;i++){
			if ((x&y)==y){
				res++;
				for (int j=1;j<=m;j++){
					a[j]=(a[j]+c[i][j])%2;
				}
			}
			y=y*2;
		}
		for (int j=1;j<=m;j++)if (a[j]!=0) return(-1);
		return(res);
	}
	static int toint(int[] x,int m){
		int y=1;
		int res=0;
		for (int i=1;i<=m;i++){
			if (x[i]==1) res=res+y;
			y=y*2;
		}
		return(res);
	}
	
	public static void main(String args[]){
		Scanner cs=new Scanner(System.in);
		while(true){
			int n=cs.nextInt();
			int m=cs.nextInt();
			int ans=0;
			if (n==0)break;
			int c[][]=new int[n+1][m+1];
			String s;
			cs.nextLine();
			for (int i=1;i<=n;i++){
				s=cs.nextLine();
				for(int j=1;j<=m;j++){
					c[i][j]=s.charAt(j-1)-48;
				}
			}
			if (n<23){
				int x=1;
				for (int i=0;i<n;i++){
					x=x*2;
				}
				for (int i=0;i<x;i++){
					int y=check(i,c,n,m);
					if (ans<y)ans=y;
				}
			}else{
				int x=0;
				for (int i=1;i<=n;i++){
					a[i]=toint(c[i],m);
					x=x^toint(c[i],m);
				}
				for (int i=0;i<4000000;i++)
					mrk[i]=0;
				boolean y[]=new boolean[1000];
				stk[0][0]=0;
				if (x==0)ans=n;else
				ans=n-bdf(x,1,n);
			}
		System.out.println(ans);
		}
	}
}
