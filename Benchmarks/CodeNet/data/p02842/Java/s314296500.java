import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int otherN = N + 1;
    
    int noTax = (int)Math.round(N / 1.08);
    int othrNoTax = (int)Math.round(otherN / 1.08);
    int inTax = (int)Math.floor(noTax * 1.08);
    int otherInTax = (int)Math.floor(otherNoTax * 1.08);
    if(inTax == N) {
      System.out.println(noTax);
    } else if(otherInTax == N) {
      System.out.println(otherNoTax);
    } else {
      System.out.println(":(");
    }
  }
}
