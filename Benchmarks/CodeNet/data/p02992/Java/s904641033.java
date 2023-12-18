import java.util.*;

class Main{
	static int mod=1000000007;
	static long modpow(long n,long a){
		if(a==0)
			return 1;
		if(a%2==0){
			long t=modpow(n,a/2);
			return t*t%mod;
		}
		return n*modpow(n,a-1)%mod;
	}

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> m=new ArrayList<>();

		int n=s.nextInt(),k=s.nextInt();
		for(int i=1;n/i>=1;++i){
			m.add(n/i);
			l.add(i=n/(n/i));
		}

		for(int i=l.size()-1;i>0;--i) {
			l.set(i,l.get(i)-l.get(i-1));
		}

		long r=0;
		for(int i=0;i<l.size();++i) {
			r+=(long)l.get(i)*modpow(m.get(i),k-1)%mod;
			r%=mod;
		}
		System.out.println(r);
	}
}
