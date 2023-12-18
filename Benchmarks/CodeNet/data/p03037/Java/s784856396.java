import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int m = stdIn.nextInt();
    int[] l = new int[m];
    int[] r = new int[m];
    for(int i = 0;i<r.length;i++) {
      l[i] = stdIn.nextInt();
      r[i] = stdIn.nextInt();
    }
    int maxGate = 100000000;
    int minGate = 0;
    for(int i = 0;i<l.length;i++) {
      minGate = Math.max(minGate,l[i]);
      maxGate = Math.min(maxGate,r[i]);
    }
    int count = maxGate - minGate + 1;
    System.out.println(count);
  }
}
