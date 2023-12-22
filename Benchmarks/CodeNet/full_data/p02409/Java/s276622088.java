import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int n, b, f, r, v;
		
		n = scan.nextInt();
		
		int a[][][];
		a = new int[10][3][4];
		
		for(int i = 0;i < n;i++){
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			if(r <= 10 && f <= 3 && b <= 4){
				a[r-1][f-1][b-1] += v;
				if(a[r-1][f-1][b-1] > 9){
					a[r-1][f-1][b-1] = 9;
				}
				if(a[r-1][f-1][b-1] < 0){
					a[r-1][f-1][b-1] = 0;
				}
			}
		}
		
		for(int j = 0; j < 4; j++){
			for(int k = 0; k < 3; k++){
				for(int l = 0; l < 10; l++){
					System.out.print(" " + a[l][k][j]);
				}
				System.out.println();
			}
			if(j != 3){
				System.out.println("####################");
			}
		}
	}	
}