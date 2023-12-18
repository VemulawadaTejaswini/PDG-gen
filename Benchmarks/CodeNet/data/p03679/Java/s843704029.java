import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;
	public static void main(String[] args)throws Exception{
		InputStream in = System.in;
		sc = new Scanner(in);

		while(true){
			int a, b, x;
			x = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();

			if(Math.abs(a-b) <= x) {
				System.out.println("safe");
				break;
			} else {
				if(a-b >= 0) {
				System.out.println("delicious");
				break;
			} else {
				System.out.println("dangeous");
				break;
			}
		}
	}
}
