import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
      if (calc(i) == N) {
        printAns(i);
        return;
      }
    }
  }
  private static int calc(int pattern) {
    int ret = 0;
    int i = 0;
    while (pattern != 0) {
      
      if (pattern % 2 == 1) {
        ret += pow(i);
      }
      
      pattern = pattern >>> 1;
      i++;
    }
    return ret;
  }
  
  private static int pow(int n) {
    if (n == 0) {
      return 1;
    }
    if (n % 2 == 1) {
      return -2 * pow(n-1);
    }
    int half = pow(n/2);
    return half*half;
  }
  
  private static void printAns(int pattern){
    StringBuilder builder = new StringBuilder();
    while (pattern != 0) {
      builder.append(pattern%2);
      pattern = pattern >>> 1;
    }
    
    System.out.println(builder.toString());
  }
}