import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    long ans = 0;

    for(int i = 1; i <= k; i++){
      for(int j = 1; j <= k; j++){
        for(int l = 1; l <= k; l++){
          System.out.println(gcd(i, j, l));
          ans += gcd(i, j, l);
        }
      }
    }

    System.out.println(ans);
  }

  public static long gcd(int a, int b, int c){
    long ans = 0;

    for(int i = 1; i <= Math.max(Math.max(a, b), c); i++){
      if(a % i == 0 && b % i == 0 && c % i == 0){
        if(ans < i){
          ans = i;
        }
      }
    }

    return ans;
  }
}