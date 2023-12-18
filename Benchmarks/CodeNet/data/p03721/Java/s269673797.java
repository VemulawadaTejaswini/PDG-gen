
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = scan.nextInt();
	int K = scan.nextInt();

	int num = 0;
	for (int i = 0; i < N; i++) {
	    int a = scan.nextInt();
	    int b = scan.nextInt();

	    num += b;
	    if(num >= K) {
		System.out.println(a);
		break;
	    }
	}
	scan.close();
    }
}
