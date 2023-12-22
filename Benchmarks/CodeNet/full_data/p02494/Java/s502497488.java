import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int i;
		int j;
		
		for(i=0;i<H;i++){
			for(j=0;j<W;j++){
			System.out.printf("#");
			}
		System.out.printf("\n");
		}
	}
}