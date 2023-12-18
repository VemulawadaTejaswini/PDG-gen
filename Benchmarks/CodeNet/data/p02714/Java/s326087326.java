import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    String[] data = new String[n];
    int r = 0;
    int g = 0;
    int b = 0;

    for (int i = 0; i < n; i++) {
      data[i] = s.substring(i,i+1);
      if (data[i].equals("R")) r++;
      if (data[i].equals("G")) g++;
      if (data[i].equals("B")) b++;
    }

    int count = 0;

    for (int i = 0; i < n-2; i++) {
      for (int j = i+1; j < n-1; j++) {
        int k = 2*j-i;
        if (k > n-1) continue;
        if (data[i].equals(data[j])) continue;
        if (data[i].equals(data[k])) continue;
        if (data[j].equals(data[k])) continue;
        count++;
      }
    }

    System.out.println(r*g*b-count);

  }

}
