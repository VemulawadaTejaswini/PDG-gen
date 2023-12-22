import java.util.Scanner;


public class Main{
	static int N, W;
	static int[] v=new int[41];
	static int[] w=new int[41];
	static int dfs(int cur, int ww, int vv) {
		int m=0;
		if(cur==N) {
			return vv;
		}
		for(int i=cur+1; i<=N; i++) {
			if(w[i]<=ww) {
				m=Math.max(m, dfs(i, ww-w[i], vv+v[i]));
			}
			else m=Math.max(m, vv);
		}
		return m;
	}
    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	N=sc.nextInt();
        	W=sc.nextInt();
        	for(int i=1; i<=N; i++) {
        		v[i]=sc.nextInt();
        		w[i]=sc.nextInt();
        	}
        	System.out.println(dfs(0, W, 0));
        }
    }
}
