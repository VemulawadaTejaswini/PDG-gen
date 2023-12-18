import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
	//WRWWRWRR     wwwrrrrwwwwrrr
	///112 112
	///1223 12
	int mod = (int) 1e9+7;
	//5 6 11
	//4 4 3 5
	//
	long[] iv;
	long[] res;
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int x = in.nextInt();
		int y = in.nextInt();
		if((x+y)%3!=0||((2*x-y)%3!=0)){
			out.println(0);
			return;
		}
		int n = (x+y)/3;
		int r = (2*x-y)/3;
		if(r<0){
			out.println(0);
			return;
		}
		res = new long[1000001+1];
		iv = new long[1000001+1];
		res[0] = 1;
		iv[0] = 1;
		for(int i=1;i<=1000001;i++){
			res[i] = (res[i-1]*i)%mod;
			iv[i] = inv(res[i]);
		}
		int k = (x+y)/3;
		x -= (x+y)/3;
		y -= k;
		long ans = div(res[x+y],x);
		ans = div(ans,y);
		out.println(ans);
		//out.println(power(2,3));
	}
	long inv(long v){
		return power(v,mod-2);
	}
	long div(long a, int b){
		return (a*iv[b])%mod;
	}
	//Map<Long,Long> mp = new HashMap<>();
	long power(long a, long b){
		if(b==0) return 1;
		//if(mp.containsKey(b)) return b;
		long ans = power(a,b/2);
		ans = (ans*ans)%mod;
		if(b%2==1) ans *= a;
		ans%=mod;
//		mp.put(b,ans);
		return ans;
	}

//	public static void main(String[] args){
//		Scanner scanner = new Scanner(new InputStreamReader(System.in));
//		long n = Long.parseLong(scanner.nextLine());
//	}
	public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main solver = new Main();
//        int num = in.nextInt();
//        while(num-->0){
//            solver.solve(1, in, out);
//        }
        solver.solve(1, in, out);
        out.close();
    }
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
