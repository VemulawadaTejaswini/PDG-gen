import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int m = sc.nextInt();
		
		int[] p = new int[n+1];
		int[] s = new int[n+1];
		
		int pret = 0;
		int id = 1;
		int maxp = 0;

		for(int i=0;i<r;i++){
			int d = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			
			p[d] += x;
			
			if(x>=0){
				if((p[d]==maxp && id>d) || p[d]>maxp){
					s[id] += t-pret;
					pret = t;
					maxp = p[d];
					id = d;
				}
			}else{
				if(d==id){
					s[id] += t-pret;
					pret = t;
					maxp = Integer.MIN_VALUE;
					for(int j=1;j<=n;j++){
						if(maxp<p[j]){
							maxp = p[j];
							id = j;
						}
					}
				}
			}
		}
		s[id] += m-pret;
		
		int max = 0;
		int ans = 0;
		for(int i=1;i<=n;i++){
			if(max<s[i]){
				max = s[i];
				ans = i;
			}
		}
		System.out.println(ans);
	}
}