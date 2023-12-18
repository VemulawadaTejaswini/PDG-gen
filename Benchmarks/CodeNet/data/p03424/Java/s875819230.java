import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(four(n, sc));
  }
  
  public static String four(int n, Scanner s) {
    for(int i = 0; i < n; i++) {
      String curr = s.next();
      if(curr.equals("Y"))
        return "Four";
    }
    return "Three";
  }
}
 