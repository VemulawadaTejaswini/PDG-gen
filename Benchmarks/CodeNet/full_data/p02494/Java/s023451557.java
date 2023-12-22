import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		for (int j=0;j<H;j++){
			for (int i=0;i<W;i++) {
				System.out.printf("#");
			}
			System.out.printf("\n");
		}
	}
}