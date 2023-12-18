import java.util.Scanner;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int ans = A * X + B * Y;
    int a = Math.min(X, Y);
    int b = Math.max(X, Y);
    int c = b - a;
    int d = a * C * 2;
    int e = 0;
    if (b == B) {
    	e = c * B;
    } else {
    	e = c * A;
    }
    int f = d + e;
   
    int t = Math.min(ans, f);
    System.out.println(t);
  }
}
