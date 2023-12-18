import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int data[] = new int[n];
    int total[] = new int[n*(n-1)/2];
    int t = 0;

    for (int i = 0 ; i < n ; i++ ) {
      data[i] = sc.nextInt();
    }

    for (int i = 0 ; i < n*(n-1)/2 ; i++ ) {
      for (int j = i+1 ; j < n*(n-1)/2 ; j++ ) {
        t = data[i]*data[j]+t;
      }
    }


    System.out.println(t);
  }
}
