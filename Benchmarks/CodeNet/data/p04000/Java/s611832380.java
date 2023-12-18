
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int a;
		int b;
		int grid[][]=new int[H][W];
		for (int i = 0; i < N; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			grid[a-1][b-1]=1;
		}
		
		
		int count[] =new int[10];
		for (int i = 0; i < (H-2); i++) {
			for (int j = 0; j <(W-2); j++) {
				int count33=0;
				for (int j2 = 0; j2 < 3; j2++) {
					for (int k = 0; k < 3; k++) {
					if(grid[i+j2][j+k]==1)count33+=1;
						
					}
				}
				count[count33]+=1;
				
			}
			
		}
		
		
		for (int i = 0; i <10; i++) {	
			System.out.println(count[i]);
		}

	}
}