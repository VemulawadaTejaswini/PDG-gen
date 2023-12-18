import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int sum = 0;
    for (int i = 0;i<n+1;i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    int b;
    int ans=0;
    int kill;
    for (int i = 0;i<n;i++){
      b = sc.nextInt();
      kill = Math.min(a[i],b);
      a[i] -= kill;
      ans += kill;
      b -= kill;
      if (b > 0){
        kill = Math.min(a[i+1],b);
        a[i+1] -= kill;
        ans += kill;
      }
    }
    System.out.println(ans);
  }
}