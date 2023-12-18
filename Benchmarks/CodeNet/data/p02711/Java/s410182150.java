import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
  
	int n = in.nextInt();
  	while (n != 0) {
    	if (n%10 == 7) {
        	System.out.println("Yes");
          	break;
        }
        n /= 10;
    }
  
    System.out.println("No");
}