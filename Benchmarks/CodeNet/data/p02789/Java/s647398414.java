import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int allTest = scanner.nextInt();
		int passed = scanner.nextInt();
    if (allTest == passed) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
	}
}