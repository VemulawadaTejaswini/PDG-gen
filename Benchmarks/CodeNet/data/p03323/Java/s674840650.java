import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partA100();
	}
	

	public static void partA100() {
		Scanner scA = new Scanner(System.in);
		int A = scA.nextInt();
		int B = scA.nextInt();
		
		if(A > 8 || B > 8) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
	}
}