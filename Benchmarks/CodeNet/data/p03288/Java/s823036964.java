import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a<1200) {
			System.out.println("ABC");
		}
		else if(a<2800) {
			System.out.println("ARC");
		}
		else {
			System.out.println("AGC");
		}
	}
}