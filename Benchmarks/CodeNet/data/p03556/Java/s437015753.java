import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = (int)Math.sqrt(n);

		System.out.println(x * x);
		
	}
}