import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int q=Integer.parseInt(scan.next());
		String s=scan.next();
		int l,r;
		int[]  ans=new int [q];
		int count;
		String substring;
		for (int i=0;i<q;++i) {
			l=Integer.parseInt(scan.next());
			r=Integer.parseInt(scan.next());
			count=0;
			substring=s.substring(l-1,r);
			if (substring.contains("A")&&
				substring.contains("C")) {
				for (int k=l-1;k<r-1;++k) {
					substring=s.substring(l-1,r);
					if (s.charAt( k )=='A'&&
						s.charAt(k+1)=='C') {
						++count;
					}
				}
			}

			ans[i]=count;
		}
		for (int i=0;i<q;++i) {
			System.out.println(ans[i]);
		}
	
}
}
//end
