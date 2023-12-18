import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int x = in.nextInt();
      int[] a = new int[N];

      long sum = 0;
      for(int i = 0; i < a.length; ++i) {
        a[i] = in.nextInt();
        sum += a[i];
      }

      if (sum < x) {
        System.out.println(N - 1);
      } else if (sum == x) {
        System.out.println(N);
      } else {
        Arrays.sort(a);
        
        int count = N;
        while ((sum -= a[--count]) > x){
        }
        
        System.out.println(count);
      }
    }
  }
}