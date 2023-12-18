import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int sum = 0;
      for(int A = 1 ; A < a + 1 ; A++){
        for(int B = 1 ; B < a + 1 ; B++){
          for(int C = 1 ; C < a + 1 ; C++){
            sum += gcd3(A,B,C);
          }
        }
      }
      System.out.println(sum);
    }
  static int gcd3(int a , int b , int c){
    return gcd2(gcd2(a,b),c);
  }
      
  static int gcd2(int a, int b){
    if(a % b == 0)
      return b;
    return gcd2(b , a % b);
  }
}
