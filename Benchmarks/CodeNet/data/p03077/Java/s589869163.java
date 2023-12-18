import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();
    long[] arr = new long[5];
    arr[0] = sc.nextLong();
    arr[1] = sc.nextLong();
    arr[2] = sc.nextLong();
    arr[3] = sc.nextLong();
    arr[4] = sc.nextLong();

    sc.close();

    Arrays.sort(arr);

    double ans = (double)N / arr[0];

    System.out.println((long) Math.ceil(ans)+4);
    
  }

}