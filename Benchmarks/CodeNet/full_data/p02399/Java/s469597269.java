import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  a = scanner.nextInt();
	  	int  b = scanner.nextInt();
	  	int  n = 0;
        float x = 0.f;
        
		n = a / b;
        System.out.print(n + " ");
		n = a % b;
        System.out.print(n + " ");
        a *= 10;
        x = a / b;
        x /= 10;
        System.out.printf("%.5f",x);
        
        
        
        scanner.close();
  }
}
