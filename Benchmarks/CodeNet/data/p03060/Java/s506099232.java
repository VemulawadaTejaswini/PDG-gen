import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
    }
    
    System.out.println(maxValue(v, c, 0));
    
    //System.out.println(Arrays.toString(v));
    //System.out.println(Arrays.toString(c));
  }
  
  private static int maxValue(int[] v, int[] c, int start) {
    
    if (start == v.length - 1) {
      return Math.max(v[start] - c[start], 0);
    }
    
    int value1 = v[start] - c[start];
    int value2 = maxValue(v, c, start + 1);
    int sum = value1 + value2;
    
    return Math.max(sum, value2);
  }
}