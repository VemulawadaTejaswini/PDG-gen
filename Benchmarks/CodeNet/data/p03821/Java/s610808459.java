import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] count = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    for (int i = n - 1; i >= 0; i--) {
     while (a[i] % b[i] != 0) { 
       for(int j = 0; j <= i; j++) {
        a[j]++;
       }
       count[i]++;
      }
    }

    for(int i = 0; i < n; i++) {
      sum += count[i];
    }
    System.out.println(sum);
  }
}

    