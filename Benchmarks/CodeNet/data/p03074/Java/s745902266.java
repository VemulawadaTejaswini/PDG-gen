import java.util.*;

class Block {
  int count;
  boolean reverse;
  
  Block(int count, boolean reverse) {
    this.count = count;
    this.reverse = reverse;
  }
}

public class Main {
  private static int solve(ArrayList<Block> blocks, int k) {
    int sum = blocks.get(0).count;
    int maxSum = sum;
    for (int i = 1; i+1 < blocks.size(); i+=2) {
      sum += blocks.get(i).count;    // flipped
      sum += blocks.get(i+1).count;  // originally reversed
      if (i - 2 * k - 1 >= 0) {
        sum -= blocks.get(i - 2 * k).count;
        sum -= blocks.get(i - 2 * k - 1).count;
      }
      maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int k = s.nextInt();
    String line = s.next();
    ArrayList<Block> blocks = new ArrayList<Block>();
    
    
    
    int count = 0;
    char[] cs = line.toCharArray();
    count = 1;
    boolean lastReverse = cs[0] == '1';
    if (!lastReverse) {
      blocks.add(new Block(0, true));
    }
    
    for (int i = 1; i < cs.length; i++) {
      boolean currentReverse = cs[i] == '1';
      if (lastReverse == currentReverse) {
        count++;
      } else {
        blocks.add(new Block(count, lastReverse));
        count = 1;
        lastReverse = currentReverse;
      }
    }
    blocks.add(new Block(count, lastReverse));
    if (!lastReverse) {
      blocks.add(new Block(0, true));
    }
    blocks.add(new Block(0, false));
    blocks.add(new Block(0, true));
    
    System.out.println(solve(blocks, k));
  }
}
