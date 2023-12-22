
import java.util.Scanner;
public class Main {
 static int[][] gyo2=new int[1000000][10];
 static int count=0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int Q=sc.nextInt();
int a[]=new int[Q];
int b[]=new int[Q];
int c[]=new int[Q];
int d[]=new int[Q];
for(int i=0;i<Q;i++) {
	a[i]=sc.nextInt();
	b[i]=sc.nextInt();
	c[i]=sc.nextInt();
	d[i]=sc.nextInt();
}
int[] gyo=new int[N];
rekyo(gyo, N, 0, M);
long ans=0;
for(int i=0;i<count;i++) {
	long kari=0;
	for(int j=0;j<Q;j++) {
		//System.out.println(gyo2[i][b[j]-1]+" "+gyo2[i][a[j]-1]+" "+c[j]);
		if(gyo2[i][b[j]-1]-gyo2[i][a[j]-1]==c[j]) {
			kari+=d[j];
		}
	}
	if(ans<kari) {
		ans=kari;
	}

}
System.out.println(ans);
		}

	public static void rekyo(int gyo[],int n,int kosu,int M) {
		if(kosu==0) {
			for(int i=1;i<=M;i++) {
				gyo[0]=i;
				rekyo(gyo,n,kosu+1,M);
			}
		}else if(1<=kosu&&kosu<n) {
			for(int i=gyo[kosu-1];i<=M;i++) {
				gyo[kosu]=i;
				rekyo(gyo,n,kosu+1,M);
			}
		}else {
			for(int i=0;i<n;i++) {
				gyo2[count][i]=gyo[i];
			}
			count++;
			return;
		}
	}

	}

