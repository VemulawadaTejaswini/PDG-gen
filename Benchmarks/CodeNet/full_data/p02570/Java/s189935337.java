import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	int D = scanner.nextint();
      	int T = scanner.nextint();
      	int S = scanner.nextint();
      	scanner.close();
      	if (D / S <= T) {
        	System.out.println("Yes");
        } else {
       		System.out.println("No");
        }
    }
}