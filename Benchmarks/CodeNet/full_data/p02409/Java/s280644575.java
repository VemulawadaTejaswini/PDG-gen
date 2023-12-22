import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][][] room = new int[4][3][10];
		
		
		for(int i = 1;i <= n;i++) {
			
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			room[b-1][f-1][r-1] = room[b-1][f-1][r-1] + v;
			
			
		}
		
		
		for(int j = 0;j < 4;j++) {
			for(int k = 0;k < 3;k++) {
				for(int l = 0;l < 10;l++) {
					System.out.print(" " + room[j][k][l]);
				}
				
				if(k != 2) {
					System.out.println("");
				System.out.println("");
				}
				
				
				
			}
			
			if(j != 3) {
				
				System.out.println("");
				System.out.println("");
				
				
				System.out.println("####################");
				
				System.out.println("");
				
				
			}
			
		}
			
		}

		

}
