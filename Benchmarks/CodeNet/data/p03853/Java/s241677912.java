import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(),W=sc.nextInt();
		String[][] arrayIn = new String[H][W];
		String[][] arrayOut = new String[H*2][W];
		String s;
		int k=0;
		for(int i=0;i<H;i++) {
			s = sc.next();
			for(int j=0;j<W;j++) {
				arrayIn[i][j] = String.valueOf(s.charAt(j));
			}
		}

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				arrayOut[k][j] = arrayIn[i][j];
				arrayOut[k+1][j] = arrayIn[i][j];
			}
			k+=2;
		}

		for(String[] out:arrayOut) {
			for(String str:out) {
				System.out.print(str);
			}
			System.out.println();
		}


	}
	public static int sample(int n) {
		return n;
	}

}
