import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

	    int D = scanner.nextInt();
	    int N = scanner.nextInt();

	    int answer = (int)Math.pow(100,D) * N;

	    System.out.println(answer);

	    scanner.close();
    }

}
