import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(Character.isUpperCase(str.charAt(0))){
			System.out.println("A");
		}else {
			System.out.println("a");
		}
	}
}