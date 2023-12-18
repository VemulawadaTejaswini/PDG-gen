import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] data = new String[n];

    for (int i = 0; i < n; i++) {
      data[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      String[] s = new String[10];
      for (int j = 0; j < 10; j++) {
        s[j] = data[i].substring(j,j+1);
      }
      data[i] = "";
      Arrays.sort(s);
      for (int j = 0; j < 10; j++) {
        data[i] += s[j];
      }
    }

    int count = 0;

    for (int i = 0; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        if (data[i].equals(data[j])) {
          count++;
        }
      }
    }

    System.out.println(count);


  }

}
