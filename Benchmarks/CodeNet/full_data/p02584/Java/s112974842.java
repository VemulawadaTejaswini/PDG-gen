import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long K = sc.nextLong();
    long D = sc.nextLong();
    long quo = X/D; //商; 0 に到達するまでの回数
    long ans = 0;
    
    if(quo>=K) {
      ans=X-K*D;
    } else {
      if((K-quo)%2 == 0) {
        ans=X-quo*D;
      } else {
        ans=(X-(quo+1)*D);
      }
    }
    System.out.println(Math.abs(ans));
  }
}