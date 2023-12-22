import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int N = Integer.parseInt(br.readLine());

	switch (N % 10) {
	case 0:
	case 1:
	case 6:
	case 8:
	    System.out.println("pon");
	    break;
	case 3:
	    System.out.println("bon");
	    break;
	default:
	    System.out.println("hon");
	}
    }
}
