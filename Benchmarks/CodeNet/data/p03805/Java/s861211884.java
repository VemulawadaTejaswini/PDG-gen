import java.util.Scanner;
public class Main{
	static boolean[][] rinsetugyouretu; //隣接行列
	static int kosu=0;
	static int M;
	static int N;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		rinsetugyouretu=new boolean[N+1][N+1];
		for(int i=0; i<M; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			rinsetugyouretu[from][to]=true;
			rinsetugyouretu[to][from]=true;
		}
		int[] ns = new int[N-1];
		for(int i=0; i<N-1; i++) {
			ns[i]=i+2;
		}
		permute(ns, ns.length);
		System.out.println(kosu);
	}
	private static void swap(int[] v, int i, int j) {
		int t = v[i]; v[i] = v[j]; v[j] = t;
	}
	public static void permute(int[] v, int n) {
		if (n == 1) {
			boolean suru=true;
			for(int i=0; i<N-1; i++) {
				if(i==0) {
					if(!rinsetugyouretu[1][v[i]]) {
						suru=false;
						break;
					}
				}
				else if(i!=0) {
					if(!rinsetugyouretu[v[i-1]][v[i]]) {
						suru=false;
						break;
					}
				}
			}
			if(suru==true) {
				kosu++;
			}
		} else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				if (n % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}
}