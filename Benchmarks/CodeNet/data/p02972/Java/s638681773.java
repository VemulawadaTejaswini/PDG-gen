import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    int[] a = new int[N+1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
    }
    
    int[] box = new int[N+1];
    
    // N -> N/2
    for (int i = N; i > N/2; i--) {
      box[i] = a[i];
    }
    // N/2 -> 1
    for (int i = N/2; i >= 1; i--) {
      int sum = 0;
      int j = 2;
      while (j*i <= N) {
        sum += box[j*i];
        j++;
      }
      if (sum % 2 == a[i]) {
        box[i] = 0;
      } else {
        box[i] = 1;
      }
    }
    
    int M = 0;
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i <= N; i++) {
      if (box[i] == 1) {
        M++;
        builder.append(i).append(' ');
      }
    }
    
    System.out.println(M);
    System.out.println(builder.toString());
 }
}