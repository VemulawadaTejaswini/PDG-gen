import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int l[][] = new int[m][2];
		int p[][] = new int[q][2];
		for(int i=0; i<m; i++){
			l[i][0] = sc.nextInt();
			l[i][1] = sc.nextInt();
		}
		for(int i=0; i<q; i++){
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		for(int i=0; i<q; i++){
			int ans = 0;
			for(int j=0; j<m; j++){
				if(l[j][0]>=p[i][0]&&l[j][1]<=p[i][1]){
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}