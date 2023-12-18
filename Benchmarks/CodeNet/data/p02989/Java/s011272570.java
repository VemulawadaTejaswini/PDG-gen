import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt =0;
      int N = sc.nextInt();
      int[] a = new int[N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      
      System.out.println(a[N/2]-a[N/2 -1]);
  }
}