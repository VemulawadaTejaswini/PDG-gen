import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.hasNext();
		char[][] c = new char[H][W];
		for (int i=0;i<H;i++){
			for (int j=0;j<W;j++){
				c[i][j] = sc.next().charAt(0);
			}
			sc.nextLine();
			
			
		}
		for (int i=0;i<H;i++){
			for (int j=0;j<W;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
			for (int j=0;j<W;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

}
