import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
      	int n = std.nextInt();
      	if (n % 2 == 0){
          System.out.println(n);
        } else {
          System.out.println(n * 2);
        }
    }
}