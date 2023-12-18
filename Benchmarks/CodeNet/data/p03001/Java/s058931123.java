import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		boolean flg = false;

		long S = W*H/2;
		if(2*x==W&&2*y==H) {
			flg = true;
		}
		System.out.print(S+" ");
		if(flg) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
