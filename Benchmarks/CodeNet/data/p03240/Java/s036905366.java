import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int n=s.nextInt();
	static int[] x=new int[n],y=new int[n],h=new int[n];

	static int nonzero=-1;

	static{
		for(int i=0;i<n;++i){
			x[i]=s.nextInt();
			y[i]=s.nextInt();
			h[i]=s.nextInt();
			if(h[i]>0)
				nonzero=i;
		}
	}

	public static void main(String[] $){
		for(int i=0;i<=100;++i){
			loop:
			for(int j=0;j<=100;++j){
				int k=h(i,j,nonzero);
				for(int l=0;l<n;++l){
					if(k>h(i,j,l)||(k<h(i,j,l)&&h[i]>0))
						continue loop;
				}
				System.out.println(j+" "+i+" "+k);
				return;
			}
		}
	}
	static int h(int i,int j,int l){
		return h[l]+Math.abs(j-x[l])+Math.abs(i-y[l]);
	}
}