import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		no1();
	}
 
	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			Integer c = sc.nextInt();
			Integer d = sc.nextInt();
 
			if (a + b > c + d) {
				System.out.println("Left");
				return;
			}
			if (a + b < c + d) {
				System.out.println("Right");
				return;
			}
			System.out.println("Balanced");
		}
	}
}