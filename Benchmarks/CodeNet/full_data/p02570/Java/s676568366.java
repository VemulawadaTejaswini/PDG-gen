import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();

		if(S*T>=D) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
