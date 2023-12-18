import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = null;
      scanner = new Scanner(System.in);

      int A = scanner.nextInt();
      int B = scanner.nextInt();
      
      float C = A / B;
      System.out.println(C);

	}
}
