import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int n = N%2==0 ? N/2 : N/2+1;
    
    int min = 100000000;
    for(int i = 1; i <= n; i++){
      int a = i;
      int b = N-i;
      int sum = 0;
      while(a > 0 || b > 0){
        sum += a%10;
        sum += b%10;
        a /= 10;
        b /= 10;
      }
      
      min = min > sum ? sum : min;
    }
    System.out.println(min);
  }
}