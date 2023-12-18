import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		if (gcd(A, B)==1) {
			System.out.println(1);
		} else {
			System.out.println(factorization(gcd(A, B)).size()+1);
		}
	}
	static long gcd(long a,long b) {
	    long temp;
	    while ((temp=a%b)!=0) {
	        a=b;
	        b=temp;
	    }
	    return b;
	}
	static ArrayList<long[]> factorization (long n) {
	    ArrayList<long[]> list = new ArrayList<long[]>();
	    long tmp= n ;
	    for (int i=2;i<=Math.sqrt(n);i++) {
	        if (tmp%i==0) {
	            int cnt=0;
	            while (tmp%i==0) {
	                cnt++;
	                tmp/=i;
	            }
	            long[] x = {i, cnt};
	            list.add(x);
	        }
	    }
	    if (tmp!=1) {
	        long[] x = {tmp, 1};
	        list.add(x);
	    }

	    if (list.size()==0) {
	        long[] x = {n, 1};
	        list.add(x);
	    }
	    return list;
	}
}