import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int min = 10;
    int A = 0;
    int B = 0;
    for(int i = 1; i <= Math.sqrt(N); i++){
      if(N % i == 0){
        A = i;
        B = (int)(N/i);
      }
    }
    System.out.println(func(A, B));
  }
  public static int func(int A, int B){
    int C = (A > B ? A : B);
    int count = 0;
    while(C > 0){
      C /= 10;
      count++;
    }
    return count;
  }
}