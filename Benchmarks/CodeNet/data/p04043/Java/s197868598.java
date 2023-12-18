import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class Main{
          public static void main(String[] args) {
                  Scanner scan = new Scanner(System.in);
                  int A = scan.nextInt();
                  int B = scan.nextInt();
                  int C = scan.nextInt();
                  boolean f = false;
                  if (A == 5 && B == 7 && C == 5) {
                          f = true;
                  }
                  if (A == 7 && B == 5 && C == 5) {
                          f = true;
                  }
                  if (A == 5 && B == 5 && C == 7) {
                          f = true;
                  }
                  if (f) {
                          System.out.println("YES");
                  }
                  else System.out.println("NO");
                  }
}
