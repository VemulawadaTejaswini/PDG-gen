import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();
    if (A == B && B != C) System.out.println("Yes");
    else if (A == C && B != C) System.out.println("Yes");
    else if (B == C && A != B) System.out.println("Yes");
    else System.out.println("No");
  }
}