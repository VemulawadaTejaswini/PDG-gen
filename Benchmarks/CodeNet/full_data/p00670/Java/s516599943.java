import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int S = sc.nextInt();
			if(n == 0 && S == 0) break;
			int[] r = new int[n];
			for(int i = 0; i < n; i++) {
				r[i] = sc.nextInt();
			}
			Arrays.sort(r);
			int ans = 0;
			for(int i = 0; i < n; i++) {
				int index = Arrays.binarySearch(r, S - r[i] + 1);
				if(index < 0) index = -(index+1);
				//System.out.println(index);
				while(index < n && index-1 >= 0 && r[index-1] == r[index])index--;
				ans += Math.max(n - index - i,0);
				//if(r[i] * 2 > S) ans--;
			}
			System.out.println(ans);
 		}
	}
}