import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		ArrayList<Integer>a=new ArrayList<>();
		ArrayList<Integer>b=new ArrayList<>();
		for(int i=0;i<n;++i) {
			int t=s.nextInt();
			a.add(t);
			b.add(t);
		}
		a.sort(null);

		for(int i=0;i<n;++i) {
			if(b.get(i)==a.get(n-1)) {
				System.out.println(a.get(n-2));
			}else {
				System.out.println(a.get(n-1));
			}
		}
	}
}
