import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  x = scanner.nextInt();
	  	int  y = scanner.nextInt();
        System.out.println(x*y);
        System.out.println((x+y)*2);
        scanner.close();
  }
}
