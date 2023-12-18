import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in); 
		int n = as.nextInt();
		int m = as.nextInt();
		int[][] a;
		a = new int[n][n];
		for(int i=0;i<n;i++){
			for(int s=i;s<n;s++){
				if(i==s){
					a[i][s]=0;
				}else{
					a[i][s]=a[s][i]=-1;
				}
			}
		}
		int b,c;
		for(int i=0;i<m;i++){
			b = as.nextInt();
			c = as.nextInt();
			a[b-1][c-1]=a[c-1][b-1]=1;
		}
		int[] di = new int[n]; 
		int[][]e;
		e = new int[n][n];
		for(int i=0;i<n;i++){
			dis(a,i,di,e);
			for(int s=i;s<n;s++){
				e[i][s]=e[s][i]=di[s];
			}
		}
		int q = as.nextInt();
		int[]l;
		l = new int[n];
		Arrays.fill(l, 0);
		int av,ad,ac;
		for(int i=0;i<q;i++){
			av = as.nextInt()-1;
			ad = as.nextInt();
			ac = as.nextInt();
			for(int s=0;s<n;s++){
				if(e[av][s]<=ad){
					l[s]=ac;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(l[i]);
		}
	}
	public static void dis(int[][] map,int src,int[] distance,int[][]e) {
		int nTown = distance.length;
		boolean[] fixed = new boolean[nTown];
		for(int i=0;i<src;i++){
			distance[i] = e[i][src];
			fixed[i] = false;
		}
		for(int i=src+1; i<nTown; i++) {
			distance[i] = Integer.MAX_VALUE;
			fixed[i] = false;
		}
		distance[src] = 0;
		while (true) {
			int marked = minIndex(distance,fixed);
			if (marked < 0) return; 
			if (distance[marked]==Integer.MAX_VALUE) return;
			fixed[marked] = true;
			for (int j=0; j<nTown; j++) { 
				if (map[marked][j]>0 && !fixed[j]) {
					int newDistance = distance[marked]+map[marked][j];
					if (newDistance < distance[j]) distance[j] = newDistance;
				}
			}
		}
	}
	static int minIndex(int[] distance,boolean[] fixed) {
		int idx=0;
		for (; idx<fixed.length; idx++)
			if (!fixed[idx]) break;
		if (idx == fixed.length) return -1;
		for (int i=idx+1; i<fixed.length; i++) 
			if (!fixed[i] && distance[i]<distance[idx]) idx=i;
		return idx;
	}
}