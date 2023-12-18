import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(readLine());
		long[] A = new long[N];
		String[] s = readLine().split(" ");
		for(int i=0;i<N;i++){
			A[i] = Long.parseLong(s[i]);
		}
		long gcd = A[0];
		for(int i=1;i<N;i++){
			gcd = gcd(gcd,A[i]);
		}
		System.out.println(gcd);
		return;
	}

	private static String readLine(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
	
	private static long gcd(long a, long b){
		long val = 1;
		for(int i=2;i<=a&&i<=b;i++){
			if(a%i==0&&b%i==0){
				val*=i;
				a/=i;b/=i;
				i--;
			}
		}
		return val;
	}
}