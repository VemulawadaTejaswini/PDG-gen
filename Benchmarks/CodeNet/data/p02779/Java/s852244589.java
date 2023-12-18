import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 準備
    int n = sc.nextInt();
    int[] a = new int[n];
    String ans = "YES";
    
    // 入力
    for(int i=0; i<n; ++i)
      a[i] = sc.nextInt();
    
    // 解く
    Arrays.sort(a);
    for(int i=1; i<n; ++i) {
      if(a[i-1] == a[i]) {
        ans = "NO"; break;
      }
    }
    
    // 出力
    System.out.println(ans);
  }
}