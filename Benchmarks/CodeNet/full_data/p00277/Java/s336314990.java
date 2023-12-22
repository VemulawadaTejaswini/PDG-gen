import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int m = sc.nextInt();
		
		int[] p = new int[n+1];
		int[] s = new int[n+1];

		int id = 1;
		int pret = 0;
		
		for(int i=0;i<r;i++){
			int d = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			s[id] += t - pret;
			pret = t;
			p[d] += x;
			
			if(x>=0){
				if(p[id]<p[d]) id = d;
				else if(p[id]==p[d] && id>d) id = d;
			}else{
				if(id==d){
					id = 1;
					for(int j=1;j<=n;j++){
						if(p[id]<p[j]) id = j;
					}
				}
			}
		}
		s[id] += m-pret;
		
		id = 1;
		for(int i=1;i<=n;i++){
			if(s[id]<s[i]) id = i;
		}
		System.out.println(id);
	}
}