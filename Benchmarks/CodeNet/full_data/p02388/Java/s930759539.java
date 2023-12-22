import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main cubic = new Main();
		cubic.start();
		
	}

	private void start() {
		Scanner scanner =new Scanner(System.in); 
		int x =scanner.nextInt();
		System.out.println(x * x * x);
		
		
	}

}