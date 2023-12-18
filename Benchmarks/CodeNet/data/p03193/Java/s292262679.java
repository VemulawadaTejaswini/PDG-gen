import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long H = sc.nextLong();
    long W = sc.nextLong();
    
    long count = 0;
    for(long i = 0; i < N; i++){
      long A = sc.nextLong();
      long B = sc.nextLong();
      if(A >= H && B >= W) count++;
    }
    System.out.println(count);
  }
}