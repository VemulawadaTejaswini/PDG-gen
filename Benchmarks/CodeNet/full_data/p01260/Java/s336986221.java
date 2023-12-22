import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n-- > 0){
			int m = sc.nextInt();
			String s = sc.next();

			System.out.println(solve(m,s,-1,false));
		}
	}

	private static int solve(int m,String s,int idx,boolean used){
		if(s.indexOf("G") == -1) return s.length();
		if(s.indexOf("B") == -1) return 0;

		int nidx = (idx + m) % s.length();
		int res = Integer.MIN_VALUE;
		String ns = s.substring(0,nidx)+s.substring(nidx+1);

		res = Math.max(res,solve(m,ns,nidx-1,used));

		if(!used && s.charAt(nidx) == 'B'){
			nidx = (nidx + 1) % s.length();
			ns = s.substring(0,nidx)+s.substring(nidx+1);
			res = Math.max(res,solve(m,ns,nidx-1,true));
		}

		return res;
	}
}