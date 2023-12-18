import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	H = sc.nextInt(),W=sc.nextInt();
		char[][] arrayM = new char[H][W];
		String[] array=new String[H];

		for(int i=0;i<H;i++) {
			array[i] = sc.next();
			for(int j=0;j<W;j++) {
				arrayM[i][j] = array[i].charAt(j);
			}
		}

		for(int i=0;i<W+2;i++) {
			System.out.print("#");
		}
		System.out.println();
		for(int i=0;i<H;i++) {
			System.out.print("#");
			for(int j=0;j<W;j++) {
				System.out.print(arrayM[i][j]);
			}
			System.out.println("#");
		}
		for(int i=0;i<W+2;i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	public static int sample() {
		return 1;
	}

}
