import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    for (int i=0;i<n;i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    sc.close();
    double dave = (double)sum/(double)n;
    int ave = (int)Math.round(dave);
    int ans = 0;
    for (int i=0;i<n;i++){
      ans += Math.pow((a[i]-ave),2);
    }
    System.out.println(ans);
  }
}