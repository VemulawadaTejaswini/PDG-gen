import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String a[];
    a = new String[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.next();
    }
    Arrays.sort(a);
    int ans = n;
    for(int i = 0; i < n - 1; i++) {
      if(a[i] == a[i + 1]) ans--;
    }
    System.out.println(ans);
  }
}

