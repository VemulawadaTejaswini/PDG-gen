import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int w = scan.nextInt();
		int oppai = scan.nextInt();
		int ans = 0;
		char c[][] = new char[h][w];
		
		for(int i=0;i<h;i++) {
			String s = scan.next();
			for(int j=0;j<w;j++) {
				c[i][j] = s.charAt(j);
			}
		}
		
		
		
		
		for (int i=0; i<(Math.pow(2,h)); i++) {
			ArrayList<Integer> pop_h = new ArrayList<Integer>();
			
			for (int j=0; j<h; j++) {
				if ((1&i>>j) == 1)  {
					pop_h.add(j);
				}
			}
			for (int k=0; k<(Math.pow(2,w)); k++) {
				ArrayList<Integer> pop_w = new ArrayList<Integer>();
				
				for (int l=0; l<w; l++) {
					if ((1&k>>l) == 1)  {
						pop_w.add(l);
					}
				}
				
				int now_check = 0;
				
				for(int l : pop_h) {
					for(int n : pop_w) {
						if(c[l][n] == '#') {
							now_check += 1;
						}
					}
				}
				
				if(now_check == oppai) {
					ans += 1;
				}
				
					
				
				
			}
			
			
			
			
		}
		
		System.out.println(ans);
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 
