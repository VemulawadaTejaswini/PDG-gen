
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    if (A.endsWith(B) && B.endsWith(C)){
    System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
