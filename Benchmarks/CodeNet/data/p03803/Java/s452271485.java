import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b =s.nextInt();
		if(a < b) {
			if(b-a == b-1) {
				System.out.println("Alice");
			}
			else {
				System.out.println("Bob");
			}
		}
		else if(b < a) {
			if(a -b == a-1) {
				System.out.println("Bob");
			}
			else {
				System.out.println("Alice");
			}
		}
		else {
			System.out.println("Drow");
		}
		s.close();


	}

}
