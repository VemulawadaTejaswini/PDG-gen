import java.util.*;

class Main{
	public static void main(String[] $){
		//System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				if(f(a)){
					System.out.println("YES");
					return;
				}
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("NO");
	}

	private static boolean f(int[] a){
		for(int k=1;k<a.length;++k)
			if(a[k-1]>a[k])
				return false;
		return true;
	}
}
