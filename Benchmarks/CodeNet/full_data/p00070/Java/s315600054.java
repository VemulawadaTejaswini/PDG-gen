import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				if (n>10||5*n*(n+1)<s) System.out.println(0);
				else System.out.println(solve(n,s,new ArrayList<Integer>(),-1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int solve(int n,int s,ArrayList<Integer> a,int add) {
		if (n==0) {
			if (s==0) {
				//for (int i=0;i<a.size();i++) {
				//	if (i==0) System.out.print(a.get(i));
				//	else System.out.print("+"+(i+1)+"*"+a.get(i));
				//}
				//System.out.println("+"+(a.size()+1)+"*"+add);
				return 1;
			}
			else {
				return 0;
			}
		}

		ArrayList<Integer> b = new ArrayList<Integer>(a);
		if (add>=0) b.add(add);

		int count = 0;
		for (int i=0;i<=9;i++) {
			if (b.indexOf(i)<0) count += solve(n-1,s-i*(b.size()+1),b,i);
			if (s-i*(b.size()+1)<0) break;
		}
		return count;
	}
}