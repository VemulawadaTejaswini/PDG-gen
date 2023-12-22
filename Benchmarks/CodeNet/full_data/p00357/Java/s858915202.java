
import java.util.*;

public class Main {
	static boolean arive=false;
	static int t[];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); t=new int[n];
		
		for(int i=0;i<n;i++)t[i]=Integer.parseInt(in.next());
		
		
		if(solve(0,'p') && solve(n-1,'r'))System.out.println("yes");
		else System.out.println("no");

	}
	
	static boolean solve(int u,char odr) {
		Stack<Integer> stk=new Stack<>();
		int d[]=new int[t.length];
		boolean jd=false;
		stk.add(u);
		while(!stk.isEmpty()) {
			int n=stk.peek();
			//System.out.println(n);
			if((odr=='p' && n==t.length-1) || odr=='r' && n==0) {
				jd=true;
				break;
			}
			
			if(odr=='p') {
				int v=n+(t[n]/10)-d[n];
				if(v>n) {
					if(v<t.length)stk.push(v);
					d[n]++;
				}
				else {
					stk.pop();
				}
			}
			else {
				int v=n-(t[n]/10)+d[n];
				if(v<n) {
					if(v>=0)stk.push(v);
					d[n]++;
				}
				else {
					stk.pop();
				}
			}
			
		}
		return jd;
	}

}

