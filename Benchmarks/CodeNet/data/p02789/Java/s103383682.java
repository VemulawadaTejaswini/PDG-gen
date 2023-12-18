import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;

class Main {
  public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String tokens[] = scanner.nextLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        if (n <= m) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    
  }
}
