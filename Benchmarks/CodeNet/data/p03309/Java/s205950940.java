import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i=0;i<n;i++) {
      a[i] = sc.nextInt() - i - 1;
    }
    Arrays.sort(a);
    int s = 0;
    int t = 0;
    int b = (n%2==0) ? (a[n/2]+a[n/2-1])/2 : a[n/2];
    for (int i=0;i<n;i++) {
      s += Math.abs(a[i] - b);
    }
    System.out.println(s);
  }
}
