import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		var k=s.nextLong();
		var a=new int[n];
		var b=new long[n];
		Arrays.setAll(a,i->s.nextInt()-1);

		int i=0;
		for(long t=k;t>0;--t){
			i=a[i];
			if(b[i]>0)
				t%=b[i]-t;
			b[i]=t;
		}
		System.out.println(i+1);
	}
}
