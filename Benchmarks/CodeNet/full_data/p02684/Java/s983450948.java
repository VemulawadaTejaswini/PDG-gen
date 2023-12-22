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
		for(int c=1;k>0;++c,--k){
			i=a[i];
			if(b[i]>0)
				k%=c-b[i];
			b[i]=c;
		}
		System.out.println(i+1);
	}
}
