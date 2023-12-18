import java.util.*;
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int total =0, ans =0;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextInt();
      total += a[i];
    }
    long ave = Math.round((double)total / N);
    for (int i =0; i<N; i++) {
      ans += (a[i] - ave) * (a[i] - ave);
    }
    System.out.println(ans);
  }
}