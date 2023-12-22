import java.util.Scanner;


public class Main{
	static int N, W;
	static int[] v=new int[41];
	static int[] w=new int[41];
	static int m=0;
	static void dfs(int cur, int ww, int vv) {
		if(m<vv) {
			m=vv;
		}
		for(int i=cur+1; i<=N; i++) {
			if(w[i]<=ww) {
				dfs(i, ww-w[i], vv+v[i]);
			}
		}
	}
    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	N=sc.nextInt();
        	W=sc.nextInt();
        	for(int i=1; i<=N; i++) {
        		v[i]=sc.nextInt();
        		w[i]=sc.nextInt();
        	}
        	dfs(0, W, 0);
        	System.out.println(m);
        }
    }
}
