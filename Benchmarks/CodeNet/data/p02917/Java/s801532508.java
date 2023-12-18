import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n-1];

    for(int i=0; i<b.length; ++i)
      b[i] = sc.nextInt();

    int ans = 0;

    // a[0]とa[n]に入るであろう値を加算
    ans = b[0] + b[b.length-1];

    // a[1]~a[n-1]に入るであろう値を加算
    for(int i=1; i<b.length; ++i) {
      ans += Math.min(b[i-1],b[i]);
    }

    System.out.println(ans);
  }
}