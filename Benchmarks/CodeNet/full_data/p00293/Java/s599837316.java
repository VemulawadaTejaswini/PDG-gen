import java.util.Scanner;

class Main {
	public static void main(String[] args){
		boolean[][] table = new boolean[24][60];
		Scanner sc = new Scanner(System.in);
		
		for (int t = 0; t < 2; t++){
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++){
				int h = sc.nextInt();
				int m = sc.nextInt();
				table[h][m] = true;
			}
		}
		
		boolean donefirst = false;
		for (int h = 0; h < 24; h++){
			for (int m = 0; m < 60; m++){
				if (table[h][m]){
					if (donefirst){
						System.out.print(" ");
					}
					else {
						donefirst = true;
					}
					System.out.printf("%d:%02d", h, m);
				}
			}
		}
		
		System.out.println("");
	}
}