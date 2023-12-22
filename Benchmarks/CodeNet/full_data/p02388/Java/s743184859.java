import java.util.Scanner;

public class Main {
	private int calc(){
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		return x*x*x;
	}
	
	public static void main(String[] args) {
		Main cubic =new Main();
		System.out.println(cubic.calc());

	}

}