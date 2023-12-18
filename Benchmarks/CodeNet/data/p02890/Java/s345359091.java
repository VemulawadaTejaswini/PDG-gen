import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]d=new int[n];
		Map<Integer,Integer> c=new HashMap<>();
		for(int i=0;i<n;++i) {
			c.merge(++d[s.nextInt()-1],1,Integer::sum);
		}

//		System.err.println(Arrays.toString(d));
//		System.err.println(c);

		for(int k=1;k<=n;++k) {
			int r=0;
			for(int i:c.values())
				r+=i/k;
			System.out.println(r);
		}
	}
}
