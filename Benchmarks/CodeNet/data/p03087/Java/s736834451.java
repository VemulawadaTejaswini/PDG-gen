import java.util.*;

class Solver {
  private int[] count;
  
  Solver(String text) {
    count = new int[text.length() + 1];
    char[] textArray = text.toCharArray();
    count[0] = 0;
    count[1] = 0;
    for (int i = 1; i < text.length(); i++) {
      if (textArray[i-1] == 'A' && textArray[i] == 'C') {
        count[i+1] = count[i] + 1;
      } else {
        count[i+1] = count[i];
      }
//      System.out.println(count[i+1]);
    }
  }
  
  public int solve(int l, int r) {
    return count[r] - count[l];
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int q = s.nextInt();
    Solver solver = new Solver(s.next());
    for (int i = 0; i < q; i++) {
      int l = s.nextInt();
      int r = s.nextInt();
      System.out.println(solver.solve(l, r));
    }
  }
}

