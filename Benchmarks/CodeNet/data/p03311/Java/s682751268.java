import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.next());
    for(int t=0; t<T; t++){
      int N = Integer.parseInt(sc.next());
      int[] a = new int[N];
      long sum = 0;
      for(int i = 0; i<N; i++){
        a[i] = Integer.parseInt(sc.next())-(i+1);
        sum += a[i];
      }
      Arrays.sort(a);
      int b = -1;
      if(N%2 == 1) b = a[N/2];
      else b = a[N/2-1];
      long res = 0;
      for(int i = 0; i<N; i++) res+= Math.abs(a[i]-b);
      System.out.println(res);
    }
  }
}