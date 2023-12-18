import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double n = scanner.nextDouble();
    double k = scanner.nextDouble();
    double r = n%k;
    
    double ans = Math.min(r, (k-r));
    System.out.println((int)ans);
    scanner.close();
  }

	
}
