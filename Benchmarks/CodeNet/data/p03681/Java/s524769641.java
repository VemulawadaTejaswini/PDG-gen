import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    if(Math.abs(m-n)>1){
      System.out.println(0);
      return;
    }
    long nn = 1;
    for(int i = 1;i<=n;i++){
      nn *= i;
      nn %= 1000000007;
    }
    long mm = 1;
    for(int i = 1;i<=m;i++){
      mm *= i;
      mm %= 1000000007;
    }
    nn *= mm;
    if(m == n)nn*=2;
    nn %= 1000000007;
    System.out.println(nn);
  }
}
