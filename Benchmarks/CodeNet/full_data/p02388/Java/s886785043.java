import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int result = calc(x);
		System.out.println(result);
		scanner.close();
	}
	
	public static int calc(int x){
		int result = (int) (Math.pow(x, 3));
		return result;
	}

}