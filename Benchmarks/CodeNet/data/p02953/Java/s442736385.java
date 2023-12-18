import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		for(int i=n-2;i>=0;--i) {
			if(a[i]>a[i+1])
				--a[i];
			if(a[i]>a[i+1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
