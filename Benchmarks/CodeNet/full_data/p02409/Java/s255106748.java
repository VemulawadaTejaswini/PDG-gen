import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][][] rooms = new int[4][3][10];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			rooms[b-1][f-1][r-1] += v;
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					System.out.print(" " + rooms[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3){
				System.out.println("####################");
			}
		}
		
	}

}