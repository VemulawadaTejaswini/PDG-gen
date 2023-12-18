import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] A){
		int a=gInt();
		long r=1;
		for(int i=2;i<a;++i){
			long v=i*i;
			if(v<=a){
				while(v*i<=a)
					v*=i;
				r=Math.max(r,v);
			}
		}
		System.out.println(r);
	}
}
