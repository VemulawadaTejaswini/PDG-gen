import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int v=0;
		long r=0;
		for(int i=0;i<n;++i){
			int d=s.nextInt();
			long c=s.nextLong();
			while(true){
				//System.err.println(r+" "+v+" "+d+" "+c);
				if(c==0)
					break;
				if(d==0) {
					r+=c;
					break;
				}
				if(c%2==1){
					--c;
					++r;
					if((v+=d)>9){
						v=v%10+v/10;
						++r;
					}
					if(c==0)
						break;
				}
				if(d<4) {
					c/=2;
					r+=c;
					d*=2;
				}else {
					r+=c;
					c/=2;
					d=d*2%10+d*2/10;
				}
			}
		}
		System.out.println(r-1);
	}
}
