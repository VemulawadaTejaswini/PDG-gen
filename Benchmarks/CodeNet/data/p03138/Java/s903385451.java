import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long xor0 = 0;
		List<Long> list = new ArrayList<>();
		List<Pair> pairs = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextLong());
		}

		for(long l:list) {
			xor0 = (xor0 + xor(0,l));
		}

		for(long i=1;i<k;i=i*2) {
			long sum = 0;
			for(long l:list) {
				sum = (sum + xor(i,l));
			}
			pairs.add(new Pair(i, sum));
		}
		long ans = xor0;
		for(long i=1;i<=k;i++) {
			long tmp = i;
			long tmpMax=xor0;
			for(int j=0;Math.pow(2, j)<=k;j++) {
				if((tmp/(int)Math.pow(2, j))%2==1) {
					tmpMax = tmpMax+pairs.get(j).b-xor0;
				}
			}
			ans = ans>tmpMax?ans:tmpMax;
		}
		sc.close();
		System.out.println(ans);
		//一つ目足した結果
	}

	static long xor(long j,long b) {
		long c = j>b?j:b;
		long sum = 0;
		for(long i=1;i<=c;i=i*2) {
			if(j%2!=b%2) {
				sum = sum + i;
			}
			j = j/2;
			b = b/2;
		}
		return sum;
	}

	static class Pair implements Comparable<Pair> {
	    long a,b;
	    public Pair(long a,long b) {
	        this.a = a;
	        this.b = b;
	    }

	    //(a,b)が一致
	    @Override
	    public boolean equals(Object o) {
	        if (o instanceof Pair) {
	            Pair p = (Pair) o;
	            return a == p.a && b == p.b;
	        }
	        return super.equals(o);
	    }

	    /*
	     * x.equals(y) ならば hashCode(x) == hashCode(y)でなければならない。
	     * この実装では同じハッシュ値をもつペアを容易に見つけられるため、ハッシュとしては弱い。
	     */
//	    @Override
//	    public int hashCode() {
//	        return a ^ b;
//	    }

	    //辞書順比較
	    @Override
	    public int compareTo(Pair o) {
	        if (a != o.a) {
	            return Long.compare(a, o.a);
	        }
	        //変えた
	        return Long.compare(b, o.b);
	    }
	}

}
