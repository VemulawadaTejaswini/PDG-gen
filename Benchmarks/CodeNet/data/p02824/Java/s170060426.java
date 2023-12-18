import java.util.*;

public class Main{
	public static void main(String[] args){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int judges=s.nextInt();
		int choice=s.nextInt();
		int set=s.nextInt();

		HashMap<Integer,Boolean> cache=new HashMap<>(n);

		int[] a=new int[n];
		Arrays.setAll(a,i->-s.nextInt());
		Arrays.sort(a);
		final int t = a[set-1];
		System.err.println(-t);
		for(int i=n-1;i>=0;--i)
			a[i]-=t;
		int[]b=Arrays.copyOf(a,n);
		Arrays.parallelPrefix(b,Integer::sum);

		System.err.println(Arrays.toString(a));
		System.err.println(Arrays.toString(b));

		int r=0;

		for(int i=0;i<n;++i){
			if(cache.containsKey(a[i])){
				if(cache.get(a[i]))
					++r;
				continue;
			}
			int aa = -a[i] + judges;
			int c = Math.max(0,choice-(n-i));
			System.err.println(i+": "+aa+" "+(b[i]-b[i-c]));

			if(aa>=0&&c==0)
				++r;
			cache.put(a[i],aa>=0&&c==0);
		}

		System.out.println(r);
	}
}
ほげ