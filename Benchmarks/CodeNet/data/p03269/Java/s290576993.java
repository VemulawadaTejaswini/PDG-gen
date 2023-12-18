import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt()-1;
		String sb=new StringBuilder(Integer.toBinaryString(n))
				.reverse().toString();

		int v=sb.length()-1;
		int l=sb.length()*2-2+sb.replaceAll("1","").length();
		System.out.println(v+" "+l);
		
		for(int i=1;i<=v;++i) {
			q(i,i+1,1<<(i-1));
			q(i,i+1,0);
		}
		if(sb.charAt(0)=='0')
			q(1,v+1,n&~1);
		for(int i=2;i<=v;++i) {
			if(sb.charAt(i-1)=='1')
				q(i,v+1,n&~((1<<i)-1));
		}
	}
	private static void q(int i,int j,int k){
		System.out.println(i+" "+j+" "+k);
	}
}
