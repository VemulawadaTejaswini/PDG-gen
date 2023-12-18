import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		HashMap<String,Integer>m=new HashMap<>();

		for(int i=0;i<n;++i) {
			char[] c=s.next().toCharArray();
			Arrays.sort(c);
			m.merge(String.valueOf(c),1,Integer::sum);
		}

		System.out.println(m.values().stream().mapToLong(i->(long)(i-1)*i/2L).sum());
	}
}
