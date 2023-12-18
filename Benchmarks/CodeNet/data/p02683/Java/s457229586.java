import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point>{
	int a;
	int b;
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.b > o.b) {
			return -1;
		}else if(this.b < o.b) {
			return 1;
		}else {			
			if(this.a > o.a) {
				return -1;
			}else if(this.a < o.a) {
				return 1;
			}else {
				return 0;
			}
		}
	
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int n = stdIn.nextInt(); //本の数
		int m = stdIn.nextInt(); //アルゴの数
	
		int x = stdIn.nextInt(); //理解度
		
		
		int [][] books = new int[n][m+1];
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m+1; j++) {
				books[i][j] = stdIn.nextInt();
				
				if(books[i][0]< min) {
					min = books[i][0];
				}
				
			}
		}
		
		//まず達成可能か見る
		boolean flag = true;
		
		
		for(int i = 1; i < m+1; i++) {
			long cnt = 0;
			for(int j = 0; j < n; j++) {
				cnt+= books[j][i];	
			}
			if(cnt<x) {
				flag = false;
			}
			
		}
		
		if(!flag) {
			System.out.println(-1);
		}else { //どの本を買えば安く買えるか
		
			for(int i = 1; i < m+1; i++) {
				Point[] point = new Point[n];
				
				for(int j = 0; j < n; j++) {
					point[j] = new Point(books[j][0],books[j][i]);
				}
				
				Arrays.sort(point);
				/*long count = 0;
				int index = 0;
				int index2 = 0;
				long ans = 0;
				
				while(count < x) {
					ans += point[index++].a;
					
					count += point[index2++].b;
					
					
				}
				
				System.out.println(ans);
				return;
				*/
				
				long minmin = Integer.MAX_VALUE;
				
				for(int k = 0; k < m; k++) {
					
					for(int l = 0;l < n; l++) {
						
						long ans = 0;
						long rikai = 0;
						
						for(int p = l+1; p < n; p++) {
							
							ans += point[k].a;
							rikai += point[k].b;
							
							
							
							
						}
					}
					
					
					
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
