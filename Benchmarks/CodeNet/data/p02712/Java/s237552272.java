import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long data1[] = new int[N];
    long total = 0;

    for (int i = 0 ; i < 15 ; i++ ) {
      data1[i] = i+1 ;
    }

    for (long i = 0 ; i < N ; i++ ) {
      if (data1[i]%3 != 0 && data1[i]%5 != 0) {
        total = total + data1[i];
      }
    }

    System.out.println(total);


  }
}
