import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    
    int ot = (n - n%100) / 100;
    int tf = n % 100;
    
	if ( ot < 13 && ot != 0 && tf < 13 && tf != 0) {
      System.out.println("AMBIGUOUS");
      return;
    }
    
    if (ot<13 && ot!=0 && (tf!=0 || tf>12)) {
      System.out.println("MMYY");
      return;
    }
    
    if (tf<13 && tf!=0 && (ot!=0 || ot>12)) {
      System.out.println("YYMM");
      return;
    }
    
    System.out.println("NA");
  }
}
