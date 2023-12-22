import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long [] a = new long[n];
    for (int i = 0; i < n; i++){
      a[i] = scan.nextLong();
      if (a[i] == 0){
        System.out.println(0);
        return;
      }
    }
    
    Arrays.sort(a);
    
    long ans = 1;

    for (int i = n-1; i >= 0; i--){
      if (a[i] > 1000000000000000000L/ans){
        System.out.println(-1);
        return;
      }else{
        ans *= a[i];
      }
    }
    System.out.println(ans);
  }
}