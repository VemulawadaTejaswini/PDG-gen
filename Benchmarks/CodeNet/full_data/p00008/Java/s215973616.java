import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		int[] ans = new int[51];

		Arrays.fill(ans, 0);

		for(int a = 0;a < 10;a++ ) {
			for(int b = 0; b < 10;b++) {
				for(int c = 0;c < 10;c++) {
					for(int d = 0;d < 10;d++){
						ans[a + b + c + d]++;
					}
				}
			}
		}
		while(scan.hasNext()) {
			System.out.println(ans[scan.nextInt()]);
		}
		
		scan.close();
	}
}
