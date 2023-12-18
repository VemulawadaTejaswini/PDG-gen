import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt()+1;
		int[]a=new int[n];
		for(int i=1;i<n;++i)
			a[i]=s.nextInt();
		int sum=Arrays.stream(a).sum();
		int r=0;
		while(sum>0) {
			for(int i=n-1;i>0;--i) {
				if(a[i]>0) {
					if(a[i-1]<1)
						++r;
					--sum;
					--a[i];
				}
			}
		}
		System.out.println(r);
	}
}