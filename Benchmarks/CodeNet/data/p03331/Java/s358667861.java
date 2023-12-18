import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int count = 0;
    if( N == 10 || N == 100 || N ==1000 || N == 10000 || N == 100000 ){
      System.out.println(10);
    }
    
      while( N > 0 ){
        count += N%10;
        N /= 10;
      }
    System.out.println(count);
  }
}

      