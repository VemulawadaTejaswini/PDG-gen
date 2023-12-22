import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int N, M, Q;
	static List<Integer> A = new ArrayList<Integer>();
	static int[] a, b, c, d;
	static int ans = 0;

	static void dfs(List<Integer> A){
		if(A.size() == N){
			int tmp = 0;
			for(int i = 0; i < Q; i++){
				if(A.get(b[i]) - A.get(a[i]) == c[i]){
					tmp += d[i];
				}
			}
			ans = Math.max(ans, tmp);
			return;
		}
		for(int i = 1; i <= M; i++){
			A.add(i);
			dfs(A);
			A.remove(A.size()-1);
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
        for(int i = 0; i < Q; i++){
        	a[i] = sc.nextInt()-1;
        	b[i] = sc.nextInt()-1;
        	c[i] = sc.nextInt();
        	d[i] = sc.nextInt();
        }
        sc.close();
        dfs(A);
        System.out.println(ans);
    }
}