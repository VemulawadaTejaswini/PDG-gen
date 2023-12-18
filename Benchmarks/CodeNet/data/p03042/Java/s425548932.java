import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String A = S.substring(0,2);
    String B = S.substring(2,4);
    int AA = Integer.parseInt(A);
    int BB = Integer.parseInt(B);
    if(AA >=1 && AA <= 12) {
      if(BB >=1 && BB <= 12) {
        System.out.println("AMBIGUOUS");
      } else {
        System.out.println("MMYY");
      }
    } else {
      if (BB >=1 && BB <= 12) {
        System.out.println("YYMM");
      } else {
        System.out.println("NA");
      }
    }      
  }
}