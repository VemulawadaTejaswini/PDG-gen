import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String> l=new ArrayList<>();

		int r=0;
		boolean f=false;

		int xa=0;
		int ba=0;
		int bx=0;

		for(int i=0;i<n;++i){
			String v=s.next();
			r+=ab(v);
			if(v.endsWith("A")){
				if(v.startsWith("B"))
					++ba;
				else
					++xa;
			}else{
				if(v.startsWith("B"))
					++bx;
			}
		}

		int t=Math.min(xa,bx);
		xa-=t;
		bx-=t;
		r+=t;

		r+=xa+bx>0?ba:Math.max(0,ba-1);
		System.out.println(r);
		System.err.println(r+" "+xa+" "+ba+" "+bx);
	}

	private static int ab(String v){
		int r=0;
		for(int i=0,e=v.length()-1;i<e;++i){
			if(v.charAt(i)=='A'&&v.charAt(i+1)=='B')
				++r;
		}
		return r;
	}
}