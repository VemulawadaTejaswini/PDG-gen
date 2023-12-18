import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
		int left = a + b;
		int right = c + d;
		if(left < right){
			System.out.println("Right");
		}else if(left > right){
			System.out.println("Left");
		}else{
			System.out.println("Balanced");
		}
	}

}
