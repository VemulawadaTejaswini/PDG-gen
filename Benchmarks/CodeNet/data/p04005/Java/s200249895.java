import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int [] arr = new int[]{ A,B,C };
    Arrays.sort(arr);

    long result = 0 ;
    if (A % 2 == 1 && B % 2 == 1 && C % 2 == 1 ) {
      result = arr[0] * arr[1];
    }
    System.out.println(result);
  }
}

