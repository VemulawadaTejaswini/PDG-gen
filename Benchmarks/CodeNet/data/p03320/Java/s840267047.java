import java.util.Scanner;


public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int k = scanner.nextInt();
		printSnuke(k);
	}
	
	public static void printSnuke(int count) {
		int c = 0;
		for(int j=0;;j++) {
			for(int i=2; i <= 10; i++) {
				long snuke = (long)(Math.pow(10, j)) * i - 1;
				c++;
				if(c > count)
					return;
				System.out.println(snuke);
			}
		}
	}

}
