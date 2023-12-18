import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] v = new int[n];
    int[] arr = new int[100000];

    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
      arr[v[i]]++;
    }

    sc.close();

    Arrays.sort(arr);

    int a = n / 2 - arr[99999];
    
    int min = 0;

    if (a < 0) {
      min = 0;
    } else {
      min = a;
    }
    
    min += n / 2 - arr[99998];

    System.out.println(min);

  }

}