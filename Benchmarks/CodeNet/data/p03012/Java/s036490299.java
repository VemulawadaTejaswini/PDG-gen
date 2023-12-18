import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int data1[] = new int[n];
    int data2[] = new int[n + 1];

    int min = 100;




    for (int i = 0 ; i < n ; i++) {
      data1[i] = sc.nextInt();
    }


    for (int i = 1 ; i < n + 1 ; i++ ) {
      data2[i] = data2[i-1] + data1[i-1] ;
    }


    for (int i = 0 ; i < n+1 ; i++ ) {
      //System.out.println(data2[n] - data2[i] - data2[i]);
      int s1 = data2[i];
      int s2 = data2[n] - data2[i];
      int abs = Math.abs(s1-s2);
      min = Math.min(min,abs);
    }


    System.out.println(min);

  }
}
