import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		long X =Long.parseLong(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");
		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}

		long ans = Math.abs(X-A[0]);

		for(int i=1;i<A.length;i++){
			ans=gcd(ans,Math.abs(X-A[i]));
		}

		System.out.println(ans);

	}

	public static long gcd(long a , long b){
		long x,y;
		if(a<b){
			x=b;
			y=a;
		}else{
			x=a;
			y=b;
		}
		long r;
		while((r=a%b)!=0){
			a=b;
			b=r;
		}
		return b;
	}
}
