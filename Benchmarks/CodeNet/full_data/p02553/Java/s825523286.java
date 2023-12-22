import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    long d = scan.nextLong();
    
    long[] ans = new long[4];
    
    ans[0] = a * c;
    ans[1] = a * d;
    ans[2] = b * c;
    ans[3] = b * d;
    long max = ans[0];
    
    for (int i = 1;i < 4;i ++) {
      if (max < ans[i])
        max = ans[i];
    }
    System.out.println(max);
  }
}
        
