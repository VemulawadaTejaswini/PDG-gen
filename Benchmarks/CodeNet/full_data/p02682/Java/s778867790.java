import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    Long K = sc.nextLong();
    long total = 0;
    
    if(K<=A) {
      total = K;
    } else if(K<=A + B) {
      total = A;
    } else {
      total = A - (K - A - B);  
    }
    System.out.println(total);
  }
}