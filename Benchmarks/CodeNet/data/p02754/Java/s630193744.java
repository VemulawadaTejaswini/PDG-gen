import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    Long A = sc.nextLong();
    Long B = sc.nextLong();
    Long round;
    Long amari;
    Long ans;
    
    round = N / (A + B);
    amari = N % (A + B);
    if (amari > A) amari = A;
    ans = A * round + amari;
    
    System.out.println(ans);
  
  }
}
