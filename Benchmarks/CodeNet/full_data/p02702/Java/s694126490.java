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
		String s = in.next();
		int n = s.length();
		char[] cs = s.toCharArray();
		int sum = 0;
		int mut = 1;
		Map<Integer,Integer> mp = new HashMap<>();
		mp.put(0,1);
		int res =0;
		for(int i=n-1;i>=0;i--){
			int pos = cs[i]-'0';
			pos*=mut;
			sum+=pos;
			sum%=2019;
			if(mp.containsKey(sum)){
				res+=mp.get(sum);
			}
			mp.put(sum,mp.getOrDefault(sum,0)+1);
			mut*=10;
			mut%=2019;
		}
		out.println(res);
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
