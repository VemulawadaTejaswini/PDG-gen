import java.util.*;
 
public class Main {
  	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int n = sc.nextInt();
      int[] a = new int[n]
      for (int i=0; i<n; i++) {
          a[n] = sc.nextInt();
      }

      int longdistance = (k - a[n]) + a[0];

      for (int j=0; j<n; j++) {
          if (longdistance < a[j]) {
              longdistance = a[j];
          }
      }

      System.out.println(k - longdistance);
    }
}