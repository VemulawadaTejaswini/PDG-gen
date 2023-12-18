import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = a[i];
    }

    sc.close();
    
    for (int i = 0; i < N - 1; i++) {
      
      if (b[i] > x) {
        b[i] = x;
      }

      if (b[i] + b[i + 1] > x) {
        b[i + 1] = b[i + 1] - (b[i] + b[i + 1] - x);  
      }

    }

    long min = 0;

    for (int i = 0; i < N; i++) {
      min += a[i] - b[i];
    }    

    System.out.println(min);

  }

}