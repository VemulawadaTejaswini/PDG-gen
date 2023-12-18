import java.util.Scanner;

public class Main {

	static int N, M, Q;
	static int[] A;
	static int[] a, b, c, d;
	static int ans = 0;

	static void dfs(int cu, int n){
		if(cu == N){
			int tmp = 0;
			for(int i = 0; i < Q; i++){
				if(A[b[i]] - A[a[i]] == c[i]){
					tmp += d[i];
				}
			}
			ans = Math.max(ans, tmp);
			return;
		}
		for(int i = n; i < M+1; i++){
			A[cu] = i;
			dfs(cu+1, i);
		}
	}

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        A = new int[N];
        for(int i = 0; i < Q; i++){
        	a[i] = sc.nextInt()-1;
        	b[i] = sc.nextInt()-1;
        	c[i] = sc.nextInt();
        	d[i] = sc.nextInt();
        }
        sc.close();
        dfs(0, 1);
        System.out.println(ans);
    }
}