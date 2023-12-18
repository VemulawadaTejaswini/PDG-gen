import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String A = "";
		String B = "";

		for(int i=0;i<a;i++) {
			B += Integer.toString(b);
		}
		for(int i=0;i<b;i++) {
			A += Integer.toString(a);
		}
		if(A.compareTo(B)<0) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
	}
}