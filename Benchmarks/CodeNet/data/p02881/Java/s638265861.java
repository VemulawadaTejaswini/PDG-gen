import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long a = 10000000000l;
    long b = 10000000000l;
    for(long i = 1;i < N;i++){
      for(long j = N / 2;j > 0;j--){
        if(N == i * j){
          if(i + j < a + b){
            a = i;
            b = j;
          }
        }
      }
    }
    System.out.println(a + b - 2);

  }
}
