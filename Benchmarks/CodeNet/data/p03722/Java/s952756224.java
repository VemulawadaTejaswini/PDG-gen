import java.util.*;
public class Main {
	

	static long dis[];
	static int N,M;
	static int a[];
	static int b[];
	static long c[];
	
	static {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		a = new int[M+1];
		b = new int[M+1];
		c = new long[M+1];
		dis = new long[N+1];
		
		for(int i=0; i<M+1; i++){
			a[i]=0;
			b[i]=0;
			c[i]=0;
		}
		
		
		for(int i=1; i<M+1; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextLong();
			c[i]=-c[i];
		}
	}
	
	public static void main(String[] args){
		for(int i=1; i<N+1; i++){
			dis[i]=Long.MAX_VALUE;
		}
		dis[1]=0;
		for(int loop=0; loop<N-1; loop++){
			for(int i=1; i<M+1; i++){
				if(dis[a[i]]==Long.MAX_VALUE){
					continue;
				}
				if(dis[b[i]]>dis[a[i]]+c[i]){
					dis[b[i]]=dis[a[i]]+c[i];
				}
			}
		}
		boolean flag[] = new boolean[N+1];
		for(int i=0; i<N+1; i++){
			flag[i]=true;
		}
		for(int loop=0; loop<N-1; loop++){
			for(int i=1; i<M+1; i++){
				if(dis[a[i]]==Long.MAX_VALUE){
					continue;
				}
				if(dis[b[i]]>dis[a[i]]+c[i]){
					flag[b[i]]=false;
				}
				if(flag[a[i]]==false){
					flag[b[i]]=false;
				}
			}
		}
		if(flag[N]==false) System.out.println("inf");
		else System.out.println(-dis[N]);
	}
}