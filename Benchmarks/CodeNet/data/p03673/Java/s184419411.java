import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String[] a = new String[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.next();
    }

    sc.close();

    String result = a[0];

    if (n % 2 == 0) {
      for (int i = 1; i < n; i++) {
        if (i % 2 == 0){
          result = result + " " + a[i];
        } else {
          result = a[i] + " " + result;
        }
      }
    } else {
      for (int i = 1; i < n; i++) {
        if (i % 2 == 0){
          result = a[i] + " " + result;
        } else {
          result = result + " " + a[i];
        }
      }
    }
    
    System.out.println(result);

  }

}
