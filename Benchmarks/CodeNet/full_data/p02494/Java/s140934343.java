import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		while(H!=0 || W!=0){
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					System.out.print("#");
				}
			System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}