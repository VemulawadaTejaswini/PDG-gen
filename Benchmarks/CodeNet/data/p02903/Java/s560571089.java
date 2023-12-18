
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		a = Math.max(a, w-a);
		b = Math.max(b, h-b);
		
		int cnt=0;
		int[] row = new int[w];
		
		int[][] mat = new int[h][w];
		
		for(int hi=0;hi<h;hi++) {
			cnt=0;
			for(int wi=0;wi<w;wi++) {
				if(cnt<a) {
					if(row[wi]<b) {
						mat[hi][wi] = 1;
						cnt++;
						row[wi]++;
					}else {
						continue;
					}
					    
				}
			}
			if(cnt==a || cnt==w-a) {
			}else {
				System.out.println("No");
				return;
			}
		}
		
		for(int r:row) {
			if(r==b || r==h-b) {
				
			}else {
				System.out.println("No");
				return;
			}
		}
		
			
		for(int hi=0;hi<h;hi++) {
			for(int wi=0;wi<w;wi++) {
				System.out.print(mat[hi][wi]);
				if(wi==w-1) {
					System.out.println("");
				}else {
					System.out.print(" ");
				}
			}
		}
		
	}

}
