import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
    
   try (Scanner scan = new Scanner(System.in)) {
			
	int N = scan.nextInt();
    
    int x = N % 2;
    int y = N / 2;
	
    double ans = (double) (x+y)/N;
    
    System.out.println(ans);
   }
    
  }
}