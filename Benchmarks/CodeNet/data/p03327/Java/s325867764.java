import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = N / 999;
    if(N % 999 == 0) {
      D--;
    }
      if(D == 0) {
        System.out.println("ABC");
      }
      
      else if(D == 1) {
        System.out.println("ABD");
      }
  }
}
 