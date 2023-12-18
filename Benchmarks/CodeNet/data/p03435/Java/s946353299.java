import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		int kari=c[0][0]+c[1][1]+c[2][2];
		boolean hanbetsu = true;

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if((c[i][j]+c[(i+1)%3][(j+1)%3]+c[(i+2)%3][(j+2)%3]!=kari)) {

					hanbetsu=false;
					break;
					}
				}
			}
		if(hanbetsu)
			System.out.print("Yes");
		else
			System.out.print("No");

	}

}
