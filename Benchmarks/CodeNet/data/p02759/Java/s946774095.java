import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int sum = 0;
		sum = (N + 1) / 2;
		System.out.println(sum);
		stdIn.close();
	}
}