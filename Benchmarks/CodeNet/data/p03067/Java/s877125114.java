import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
      	int a = scanner.nextInt();
      	int b = scanner.nextInt();
      	int c = scanner.nextInt();
    	System.out.println(a < c && c < b || b < c && c < a ? "Yes" : "No");
    }
}