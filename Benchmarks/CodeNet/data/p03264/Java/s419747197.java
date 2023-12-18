import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		int K=scanner.nextInt();
		int kosuu=((K/2)*((K+1)/2));

		System.out.println(kosuu);
	}

}