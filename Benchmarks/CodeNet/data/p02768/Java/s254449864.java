
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String as[] = br.readLine().split(" ");
		int n = Integer.parseInt(as[0]);
		int a = Integer.parseInt(as[1]);
		int b = Integer.parseInt(as[2]);
		long mod =(long) Math.pow(10, 9)+7;
		long p2n = power(2,n,mod);
		long nca = comb(n,a ,mod);
		long ncb = comb(n,b,mod);
		long res = sub(p2n,nca ,mod);
		res = sub(res,ncb ,mod);
		res = sub(res,1 ,mod);
		System.out.println(res);
	}
	
	static long comb(int n,int k,long mod) {
		long bunshi = 1;
		long bunbo = 1;
		for(int i = 1; i <= k;i++) {
			bunshi = mul(bunshi,n-i+1,mod);
			bunbo =  mul(bunbo, i,mod);
		}
		return div(bunshi,bunbo,mod);
		
	}
	
	static long power(long x, long y,long mod) {
		if(y == 0) {
			return 1;
		}else if(y == 1) {
			return x % mod;
		}else if(y % 2 == 0) {
			return (long) (Math.pow(power(x,y/2,mod),2) % mod);
		}else {
			return (long) (Math.pow(power(x,y/2,mod),2) *x % mod);
		}
	}
	
	static long mul(long a , long b,long mod) {
		return (a%mod)*(b%mod)%mod;
	}
	
	static long sub(long a,long b,long mod) {
		return (a+mod-b)%mod;
	}

	static long modinv(long a , long mod) {
		long b = mod;
		long u =1,v=0;
		while(b > 0) {
			long t = a/b;
			long tmp;
			a -=t*b;
			tmp = a; a = b; b = tmp;
			u -= t*v; 
			tmp = u; u = v; v = tmp;
		}
		u %= mod;
		if( u < 0) {u += mod;}
		return u;
		
	}
	static long div(long a,long b , long mod) {
		return  mul(a, modinv(b,mod),mod);
	}
	static long add(long a, long b ,long mod) {
		return (a + b) % mod;
	}

	

}
