import java.util.*;
import java.io.*;

class Main {
  public static void main(String argv[]) {
    int n;
    
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    
    int a[] = new int[n];
    int b[] = new int[n];
    
    for (int i = 0;i < n;i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0;i < n;i++) {
      b[a[i] - 1] = i + 1;
    }
    PrintWriter out = new PrintWriter(System.out);
    for (int i = 0;i < n;i++) {
      out.print(b[i] + " ");
    }
    out.println();
    out.flush();
  }
}