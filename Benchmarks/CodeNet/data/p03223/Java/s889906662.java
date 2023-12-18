import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int[] a=new int[n];
		Arrays.setAll(a,i->Integer.parseInt(s.next()));
		Arrays.sort(a);
		int b=a[0],c=a[n-1];

		int l=1,r=n-2;

		int v=c-b;

		while(l<=r){
			int w=0;
			w=Math.max(w,Math.abs(b-a[l]));
			w=Math.max(w,Math.abs(b-a[r]));
			w=Math.max(w,Math.abs(c-a[l]));
			w=Math.max(w,Math.abs(c-a[r]));
			v+=w;
			//System.err.println(w);
			if(w==Math.abs(b-a[l])){
				b=a[l++];
				continue;
			}
			if(w==Math.abs(b-a[r])){
				b=a[r--];
				continue;
			}
			if(w==Math.abs(c-a[l])){
				c=a[l++];
				continue;
			}
			if(w==Math.abs(c-a[r])){
				c=a[r--];
				continue;
			}
		}
		System.out.println(v);
	}
}
