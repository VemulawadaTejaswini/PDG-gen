import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [][][] room = new int [4][3][10];

		int n = scan.nextInt();

		for(int i = 0 ; i < n ; i++){
			int b = scan.nextInt(), f = scan.nextInt(),
					r = scan.nextInt(), v = scan.nextInt();
			    room [b-1][f-1][r-1] += v;
		}

		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				for(int k = 0 ; k < 10 ; k++){
					System.out.print(" "+room[i][j][k]);
				}
				System.out.println();
			}
			if(i==3) break;
			System.out.println("####################");
		}
	}
}