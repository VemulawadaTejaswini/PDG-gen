import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    scanner.close();
    
    int n = 1000000000;

    boolean hasResult = false;

    for (int i = 0; i < n; i++){
      if (Math.abs(A - i) == Math.abs(B - i)){
        hasResult = true;
        System.out.println(i);
        break;
      }
    }

    if (!hasResult){
      System.out.println("IMPOSSIBLE");
    }
    
  }

}