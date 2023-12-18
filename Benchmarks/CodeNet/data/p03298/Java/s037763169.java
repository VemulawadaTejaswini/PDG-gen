import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		StringBuffer l = new StringBuffer();
		StringBuffer r = new StringBuffer();
		int x = make(s,l,r,0,n,n,0);
		System.out.println(x);
	}
	
	public static int make(String s,StringBuffer l,StringBuffer r,int begin,int end,int n,int h) {
		if(h==n) {
			for(int j=begin;j<2*n;j++) {
				r.append(s.charAt(j));
			}
			String sl = l.toString();
			String sr = r.reverse().toString();
			if(sl.equals(sr)) return 1;
			else return 0;
		}
		int counter = 0;
		
		for(int i=begin;i<=end;i++) {
			StringBuffer nl = clone(l);
			StringBuffer nr = clone(r);
			nl.append(s.charAt(i));
			for(int j=begin;j<i;j++) {
				nr.append(s.charAt(j));
			}
			counter += make(s,nl,nr,i+1,end+1,n,h+1);
		}
		return counter;
	}
	
	public static StringBuffer clone(StringBuffer sb) {
		StringBuffer nsb = new StringBuffer();
		nsb.append(sb.toString());
		return nsb;
	}

}