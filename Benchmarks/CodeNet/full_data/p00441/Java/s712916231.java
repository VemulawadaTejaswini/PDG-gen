import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] x = new int[n];
			int[] y = new int[n];
			boolean[][] map = new boolean[5001][5001];
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				map[y[i]][x[i]] = true;
			}
			
			int max = 0;
			int p, q, a, b, c, d;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					p = x[i] - x[j];
					q = y[i] - y[j];
					a = y[i] + p;
					b = x[i] - q;
					c = y[j] + p;
					d = x[j] - q;
					
					for(int k=0;k<2;k++){
						if(0<=a && a<=5000 && 0<=b && b<=5000 && 0<=c && c<=5000 && 0<=d && d<=5000){
							if(map[a][b]==true && map[c][d]==true){
								max = Math.max(max, p*p + q*q);
								break;
							}
						}
						a -= 2*p;
						b += 2*q;
						c -= 2*p;
						d += 2*q;
					}
				}
			}
			System.out.println(max);
		}	
	}	
}