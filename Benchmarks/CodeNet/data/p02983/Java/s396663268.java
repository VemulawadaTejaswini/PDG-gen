import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    
    if (((long)R / 2019) > ((long)L / 2019)) {
      System.out.println(0);
      return;
    }
    
    System.out.println(((long)L%2019) * (((long)L%2019) + 1));
  }  
}
