import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int i,j,k;
        int[][][] x = new int[4][3][10];
        
		for(i = 0; i < a; i++){
			int b = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
            int e = sc.nextInt();
            
            x[b][c][d] = x[b][c][d] + e;
		}

		for(i = 0; i < 4; i++){
			for(j = 0; j < 3; j++){
				for(k = 0; k < 10; k++){
					System.out.print(" " + x[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3) System.out.printf("####################\n");
		}

	}
}

