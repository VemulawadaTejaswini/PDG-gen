import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] aH = new String[H];
		for(int m=0; m<H; m++) {
			aH[m] = sc.next();
		}

		for(int i=0; i<aH[0].length()+2; i++) {
			System.out.print("#");
		}System.out.print("\n");

		for(int j=0; j<H; j++) {
			System.out.print("#");
			System.out.print(aH[j]);
			System.out.print("#");
			System.out.print("\n");
		}

		for(int k=0; k<aH[0].length()+2; k++) {
			System.out.print("#");
		}

	}

}
