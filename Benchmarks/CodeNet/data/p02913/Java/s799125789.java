import java.util.*;


public class Main {
	
	static int n, l, r, max;
	static String s, now;
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next();
		sc.close();
		
		l = 0; r = 0;
		max = 0;
		now = "";
		
		for(;l<n;l++) {
			
			if(l>r) {
				r=l;
				now = "";
			}
			if(now.length()>0) {
				now = now.substring(1);
			}
			while(check(r)) {
				now += s.charAt(r);
				max = Math.max(max, r - l + 1);
				r++;
			}
			
		}
		System.out.println(max);
		
	}
	
	static boolean check(int x) {
		char c = s.charAt(x);
		int len = now.length() + 1;
		if(s.indexOf(now + c, l + len)==-1) return false;
		else return true;
	}
	
}
