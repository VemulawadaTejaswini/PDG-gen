import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long count = 0;
   for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
    b[i] = sc.nextInt();
   }

    for (int i = n - 1; i >= 0; i--) {
     while (a[i] % b[i] != 0) { 
       for(int j = 0; j <= i; j++) {
        a[j]++;
       }
       count++;
      }
    }

    System.out.println(count);
  }
}

    