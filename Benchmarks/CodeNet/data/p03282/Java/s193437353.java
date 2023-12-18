import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Long K = sc.nextLong();
    char ans;
    if(K == 1){
      ans = S.charAt(0);
    }else{
      int i = 0;
      int count = 0;
      while(S.charAt(i) == '1'){
        count++;
        i++;
      }
      if(K <= count) ans = '1';
      else ans = S.charAt(count);
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}