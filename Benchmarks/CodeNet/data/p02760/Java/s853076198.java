import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    
	    int[][] A = new int[3][3];
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            A[i][j] = nextInt();
	        }
	    }
 
	    int N = nextInt();
	    int[] b = new int[N];
	    for(int i=0; i<N; i++){
	        b[i] = nextInt();
	    }
	    
	    // アタリ初期化
	    boolean [][] appear = new boolean[3][3];
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            appear[i][j] = false;
	        }
	    }
	    
	    // 数値チェックして合っているならtrueで埋める
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            for(int k=0; k<N; k++){
    	            if(A[i][j] == b[k]) appear[i][j] = true;
	            }
	        }
	    }
 
	    String ANS = "No";
 
	    // 横チェック
	    for(int i=0; i<3; i++){
	        if(appear[i][0] && appear[i][1] && appear[i][2]) ANS = "Yes";
	    }

	    // 縦チェック
	    for(int i=0; i<3; i++){
	        if(appear[0][i] && appear[1][i] && appear[2][i]) ANS = "Yes";
	    }

	    // 斜めチェック
	    if(appear[0][0] && appear[1][1] && appear[2][2]) ANS = "Yes";
	    if(appear[0][2] && appear[1][1] && appear[2][0]) ANS = "Yes";

	    out.println(ANS);
	}
 
	void preCalc() {
 
	}
 
	void stress() {
 
	}
 
	void test() {
 
	}
 
	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}
 
	static final Random rng = new Random();
 
	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}
 
	public static void main(String[] args) throws IOException {
		new Main();
	}
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}
 
	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
 
	int nextInt() {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}