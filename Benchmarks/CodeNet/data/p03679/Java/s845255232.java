import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a - b >= 0){
			System.out.println("delicious");
		}else{
			if(a - b < -x){
				System.out.println("dangerous");
			}else{
				System.out.println("safe");
			}
		}
	}
}