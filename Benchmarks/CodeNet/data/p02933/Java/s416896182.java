import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String s = sc.next();
		sc.close();

		if(a>=3200) {
			System.out.println(s);
		} else {
			System.out.println("red");
		}

	}
}