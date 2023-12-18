import java.util.Scanner;
public class Main {
 static int[][] gyo2=new int[1000000][9];
 static int count=0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean used[]=new boolean[N];
		int[] gyo=new int[N];
		rekyo(gyo, N, 0, used);
		int P[]=new int[N];
		int Q[]=new int[N];
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			Q[i]=sc.nextInt();
		}
		int p=0,q=0;
		boolean flag=false;
		for(int i=0;i<count;i++) {
			for(int j=0;j<N;j++) {
				if(P[j]!=gyo2[i][j]) {
					break;
				}
				if(j==N-1) {
					p=i;
					flag=true;
					break;
				}
			}
			if(flag)
				break;
		}
		 flag=false;
		for(int i=0;i<count;i++) {
			for(int j=0;j<N;j++) {
				if(Q[j]!=gyo2[i][j]) {
					break;
				}
				if(j==N-1) {
					q=i;
					flag=true;
					break;
				}
			}
			if(flag)
				break;
		}
		System.out.println(Math.abs(p-q));

		}

	public static void rekyo(int gyo[],int n,int kosu,boolean used[]) {
		if(kosu<n) {
			for(int i=1;i<=n;i++) {
				if(!used[i-1]) {
					gyo[kosu]=i;
					used[i-1]=true;
					rekyo(gyo,n,kosu+1,used);
					used[i-1]=false;
				}
			}
		}else {
			for(int i=0;i<n;i++) {
				gyo2[count][i]=gyo[i];
			}
			count++;
			return;

		}}

	}



