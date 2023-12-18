import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A1 = sc.nextInt();
    int A2 = sc.nextInt();
    int ans = gcd(A1,A2);
    for(int i = 2;i < N; i++){
      A2 = sc.nextInt();
      ans = gcd(ans,A2);
    }
    System.out.println(ans);
  }
  static int gcd(int a,int b){
    if (b == 0)
    return a;
    return gcd(b,a % b);
  }
  
}
