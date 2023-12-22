import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      sum += a[i];
    }

    long ret = 0;
    for (int i=0;i<n;i++){
      sum -= a[i];
      ret += sum*a[i];
      ret = (long) ret%1000000007;
    }

    System.out.println(ret);
  }
}
