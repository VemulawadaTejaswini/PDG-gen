import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int value = sc.nextInt();
			if(value >=1 && value <=100) {
				System.out.println((int)Math.pow(value,3));			
			}
		}
	}
}