import java.util.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
      int a = sc.nextInt();
      int b = a / 3;
      int c = a % 3;
      int ret = 1;
      if (a < 3) {
          System.out.println(0);
          return;
      }
      // b*3+c = a
      for (int i = 2; i <= b; i++) {
          int d = 1;
          if (c == 1) d = b;
          if (c == 2) d = b * b;
        ret += mod(mod(combination((b - 1),(i - 1))) * d);
      }
      System.out.println(ret);
      
}
public static int mod(int num) {
        return num % 1000000007;
      }
      public static int combination(int n, int r) {
    if (r == 0 || r == n) {
        return (1);
    } else if (r == 1) {
        return (n);
    }
    return (combination(n - 1, r - 1) + combination(n - 1, r));
}

}