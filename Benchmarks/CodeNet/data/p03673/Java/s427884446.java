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

    Deque<String> deque = new ArrayDeque<>();

    if (n % 2 == 0) {
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0){
          deque.addLast(a[i]);
        } else {
          deque.addFirst(a[i]);
        }
      }
    } else {
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0){
          deque.addFirst(a[i]);
        } else {
          deque.addLast(a[i]);
        }
      }
    }
    
    PrintWriter out = new PrintWriter(System.out);

    int size = deque.size();

    for (int i = 0; i < size; i++) {
      out.print(deque.pollFirst()) ;
      if (i != size - 1) {
        out.print(" ");
      }
    }
    out.println("");

    out.flush();

  }

}
