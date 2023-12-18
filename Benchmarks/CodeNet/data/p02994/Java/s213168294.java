import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int[] arr = new int[N+1];
    sc.close();

    arr[0] = 0;
    int all = 0;

    for (int i = 1; i < N+1; i++) {
      arr[i] = L + i - 1;
      all += arr[i];
    }

    int d = 200;
    int r = 200;

    for (int i = 1; i < N+1; i++) {
      if (Math.abs(arr[i]) < d){
        d = Math.abs(arr[i]);
        r = arr[i];
      }
    }

    System.out.println(all - r);

  }
  
}