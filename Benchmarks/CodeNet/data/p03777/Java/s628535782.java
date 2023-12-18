import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		if(a.equals(b)){
			System.out.println("H");
		}else {
			System.out.println("D");
		}
	}

}
