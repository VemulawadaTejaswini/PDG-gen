import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    //1≤N≤10^5
    //1≤ai,bi,ci≤10^4
    //N
    //a1 b1 c1
    //a2 b2 c2
    //:
    //aN bN cN
    public void run() {
    	try {
	    	FastScanner0 sc = new FastScanner0(System.in);

	        int N = sc.nextInt();
	        int l[][] = new int[N][3];
	        int dp[][] = new int[N][3];

	        for (int i=0; i<N; i++) {
	        	l[i][0] = sc.nextInt();
	        	l[i][1] = sc.nextInt();
	        	l[i][2] = sc.nextInt();
	        }

	        //System.out.println("--------Start-----------");
	        MaxCalc maxcalc = new MaxCalc();

	        for(int i=0; i<N; i++) {
	        	if(i==0) {

	        		//
	        		dp[i] = l[i];
	        	}else {
	        		for(int k=0; k<3; k++) {
	        			MaxCalc val = maxcalc.max(dp[i-1],k);
	        			dp[i][k] = l[i][k] + val.max;
	        		}
	        	}
	        	//System.out.println(i + " ; dp : " +  Arrays.deepToString(dp));
	        }

	        System.out.println(Arrays.stream(dp[N-1]).max().getAsInt());


    	}catch(Exception e) {
    		e.printStackTrace();
    	}


    }
}

class MaxCalc {
	int i;
	int max = 0;
	public MaxCalc max(int[] nums,int ignore) {
		MaxCalc maxcalc = new MaxCalc();
        for (int i=0 ; i < nums.length; i++) {
            if (maxcalc.max < nums[i] && i != ignore) {
            	maxcalc.max = nums[i];
            	maxcalc.i = i;
            }
        }
        return maxcalc;
    }
}


//高速なScanner
class FastScanner0 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner0(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
