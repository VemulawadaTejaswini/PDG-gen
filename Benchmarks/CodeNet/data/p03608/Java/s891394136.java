import java.util.*;
public class Main {
	
static List<String> z;
	
	public static void permutation(String q, String ans){
		if(q.length() <= 1) {
			z.add(ans + q);
	    }
	    else {
	    	for (int i = 0; i < q.length(); i++) {
	    		permutation(q.substring(0, i) + q.substring(i + 1),
	    		ans + q.charAt(i));
	        }
	    }
	}

	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int[] r = new int[R];
		int[][] d = new int[N][N];
		Arrays.setAll(r, i -> sc.nextInt()-1);
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if(i != j)
					d[i][j] = INF;
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			int C = sc.nextInt();
			d[A][B] = C;
			d[B][A] = C;
		}
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[j][k]);
		z = new ArrayList<>();
		String S = "";
		for(int i = 0; i < R; i++)
			S += r[i];
		permutation(S,"");
		long ans = INF, temp;
		for(String s : z) {
			temp = 0;
			for(int j = 1; j < R; j++)
				temp += d[s.charAt(j-1)-'0'][s.charAt(j)-'0'];
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}

}