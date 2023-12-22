import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[][] = new int[2][3];
		int x,y;

		while(scan.hasNext()){
			for(int i=0;i<2;i++){
				for(int j=0;j<3;j++){
					num[i][j] = scan.nextInt();
				}
			}

			x = (num[0][1]*num[1][2] - num[1][1]*num[0][2])/(num[0][1]*num[1][0]-num[0][0]*num[1][1]);
			y = (num[0][2]-num[0][0]*x)/num[0][1];

			System.out.println((float)x + " " + (float)y);
		}
	}
}