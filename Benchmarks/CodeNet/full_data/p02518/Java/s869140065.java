import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int N = in.nextInt();
			if(N==0) return ;
			BigInteger[] bs = new BigInteger[N*(N+1)/2];
			for(int i=0; i<N*(N+1)/2; i++){
				bs[i] = in.nextBigInteger();
			}
			solve(N, bs);
		}
	}

	void solve(int N, BigInteger[] bs){
		BigInteger[] even = new BigInteger[N];
		BigInteger[] odd = new BigInteger[bs.length-N];
		for(int i=0, p=0, q=0; i<bs.length; i++){
			if(bs[i].mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
				even[p++] = bs[i];
			}
			else{
				odd[q++] = bs[i];
			}
		}
		BigInteger a = BigInteger.ONE, b = BigInteger.ONE;
		for(int i=0; i<N; i++){
			a = a.multiply(even[i]);
		}
		a = a.pow(N-1);
		System.out.println("2\n3 3");
		if(1==1)return ;
		for(int i=0; i<odd.length; i++){
			b = b.multiply(odd[i]);
			BigInteger d = a.gcd(b);
			a = a.divide(d);
			b = b.divide(d);
		}
		int low = 0, high = Integer.MAX_VALUE; 
		while(high - low > 1){
			BigInteger mid = BigInteger.valueOf((low+high)/2).pow(N*(N-1));
			if(mid.multiply(b).compareTo(a)>0){
				high = (high + low)/2;
			}
			else{
				low = (high + low)/2;
			}
		}
		System.out.println(low);
		int[] es = new int[N];
		for(int i=0; i<N; i++){
			es[i] = (int)(even[i].longValue()/low);
		}
		Arrays.sort(es);
		for(int i=0; i<N; i++){
			System.out.printf("%d%c", es[i], i==N-1?'\n':' ');
		}
	}

	public static void main(String[] args){
		new Main().run();
	}
}