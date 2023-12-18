import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long[] x=new long[N],y=new long[N],z=new long[N];
		for(int i=0; i<N; i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
			z[i]=sc.nextLong();
		}
		long zf=-1;
		int[] select=new int[M];
		for(int i=0; i<M; i++) {select[i]=i;}
		for(;select[M-1]<N;select[0]++) {
			for(int k=0; k<M-1; k++) {
				if(select[k]>=N) {select[k]=0;select[k+1]++;}
			}
			if(select[M-1]==N)break;
			boolean breakf=false;
			for(int o=0; o<M; o++) {
				for(int p=0; p<M; p++) {
					if(p!=o&&select[p]==select[o]) {breakf=true;}
				}
			}
			if(breakf) {continue;}
 
			long scoreX=0,scoreY=0,scoreZ=0;
			for(int i=0; i<M; i++) {
				scoreX+=x[select[i]];
				scoreY+=y[select[i]];
				scoreZ+=z[select[i]];
			}
			long scoreT=Math.abs(scoreX)+Math.abs(scoreY)+Math.abs(scoreZ);
			//System.out.prlongln(scoreT);
			if(zf==-1||scoreT>zf) {
				zf=scoreT;
			}
		}
		System.out.println(zf);
	}
 
}