import java.util.*;

class Main {


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt(), m = in.nextInt();
			if(n==0 && m==0) break;
			System.out.println(solve(n,m));
		}
	}

	static int solve(int n, int m){
		Vector<Integer> ns = new Vector<Integer>(), ms = new Vector<Integer>();
		for(int i=1; i*i<=n; i++){
			if(n%i==0) ns.add(new Integer(i));
		}
		for(int j=1; j*j<=m; j++){
			if(m%j==0) ms.add(new Integer(j));
		}
		int ans = 1<<29;
		int fs[] = new int[4];
		for(int i=0; i<ns.size(); i++)
			for(int j=0; j<ms.size(); j++){
				fs[0] = ns.get(i).intValue();
				fs[1] = n/fs[0];
				fs[2] = ms.get(j).intValue();
				fs[3] = m/fs[2];
				Arrays.sort(fs);
				int t=0;
				for(int k=0; k<3; k++)
					t += (fs[k+1] - fs[k])*(fs[k+1] - fs[k]);
				if(t < ans) ans = t;
			}
		
		return ans;
	}
}