import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int v[][][] = new int[4][3][10];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int b = scan.nextInt() - 1;
			int f = scan.nextInt() - 1;
			int r = scan.nextInt() - 1;
			v[b][f][r] += scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + v[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3){
				System.out.println("####################");
			}
		}
	}
}