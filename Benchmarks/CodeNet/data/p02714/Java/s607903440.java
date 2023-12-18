
import java.util.Scanner;

public class Main {
	
	static int n;
	static char[]c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		
		c = sc.next().toCharArray();
		
		int[] r = new int [n+2];
		int[] g = new int [n+2];
		int[] b = new int [n+2];
		
		for(int i = 0 ; i < n ;i++) {
			
			if(c[i] == 'R') {
				r[i]++;
			}
			if(c[i] == 'G') {
				g[i]++;
			}
			if(c[i] == 'B') {
				b[i]++;
			}
			
			r[i+1] = r[i];
			g[i+1] = g[i];
			b[i+1] = b[i];
		}
		
		long ans = solve(r,g,b);
		System.out.println(ans);
		
	}
	
	static long solve(int []r , int []g , int[]b) {
		long temp = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = n-1 ; j >= 0; j--) {
				if(i == j) {
					break;
				}
				if(c[i] == c[j]) continue;
				
				int jdg = -1;
				boolean p = false;
				
				if((i + j)% 2 == 0) {
					jdg = (i + j)/2;
					p = true;
				}
				if(c[i] != 'R' && c[j] != 'R') {
					temp  += (long)(r[j] - r[i]);
					if(p) {
						if(c[jdg] == 'R'){
						temp--;
						}
					}
				}
				else if(c[i] != 'G' && c[j] != 'G') {
					temp  += (long)(g[j] - g[i]);
					if(p) {
					if(c[jdg] == 'G') {
						temp--;
						}
					}
				}
				else if(c[i] != 'B' && c[j] != 'B') {
					temp  +=(long)(b[j] - b[i]);
					if(p) {
					if(c[jdg] == 'B') {
						temp--;
					}
				}
			}
		}
	}
		
		return temp;

		}
}
