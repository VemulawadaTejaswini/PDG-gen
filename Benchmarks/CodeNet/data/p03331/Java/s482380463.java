import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int min = 120000;
    for(int A=1; A<=N-1; A++){
      int B = N-A;
      int sumA = sumOfdigits(A);
      int sumB = sumOfdigits(B);
      if((sumA + sumB) < min){
        min = sumA + sumB;
      }
    }
    System.out.println(min);
  }
     private static int sumOfdigits(int n){
     int sum=0;
     while(n>0){
       sum +=n%10;
       n=n/10;
     }
     return sum;
   }
}