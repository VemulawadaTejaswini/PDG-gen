import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[][][] house = new int[4][3][10];
		int n = scan.nextInt();

		for(int i = 0; i < n; i++){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			house[b - 1][f - 1][r - 1] += v;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					if(k != 9){
						System.out.printf(" %d", house[i][j][k]);
					} else{
						System.out.printf(" %d\n", house[i][j][k]);
					}
				}
			}
			if(i != 3){
				System.out.println("####################");
			}
		}
	}
}