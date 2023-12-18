import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=sc.nextInt();
    while(true) {
      C -= B;
      A -= D;
      if(C<=0) {
        System.out.println("Yes");
        break;
      }
      if(A<=0) {
        System.out.println("No");
        break;
      }
    }
  }
}