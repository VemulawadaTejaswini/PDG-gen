import java.util.Arrays;
import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int N = s.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++) {
			p[i] = s.nextInt();
		}
		int ans =0;
		Arrays.sort(p); //昇順にソート
		for(int i=0; i<=101; i++) {
			boolean include = false;
			for(int k=0; k<p.length; k++) {
				if(i == p[k]) {include = true; break;}
			}
			
			if(!include && Math.abs(X-ans) > Math.abs(X-i)  ) {
				ans = i; 
			}
		}
		
		System.out.println(ans);
		
	}

}
