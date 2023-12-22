import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long ans = 1;
    long [] a = new long[n];
    for (int i = 0; i < n; i++){
      a[i] = scan.nextLong();
      if (a[i] == 0){
        System.out.println(0);
        return;
      }
    }
    Arrays.sort(a);
    
    for (int i = 0; i < n; i++){
      ans *= a[i];
      if (ans > 1000000000000000000L){
        System.out.println(-1);
        return;
      }
    }
    System.out.println(ans);
  }
}