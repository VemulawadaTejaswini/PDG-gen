import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int m = sc.nextInt();
		
		int[] p = new int[n+1];
		int[] s = new int[n+1];

		int maxid = 1;
		int pret = 0;
		
		for(int i=0;i<r;i++){
			int d = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			s[maxid] += t - pret;
			pret = t;
			p[d] += x;
			
			if(x>0 && p[maxid]<p[d]){
				maxid = d;
			}else if(x>0 && p[maxid]==p[d] && maxid>d){
				maxid = d;
			}else if(x<=0 && maxid==d){
				for(int j=1;j<=n;j++) if(p[maxid]<p[j]) maxid = j;
			}
		}
		s[maxid] += m-pret;
		
		maxid = 1;
		for(int i=1;i<=n;i++) if(s[maxid]<s[i]) maxid = i;
		System.out.println(maxid);
	}
}