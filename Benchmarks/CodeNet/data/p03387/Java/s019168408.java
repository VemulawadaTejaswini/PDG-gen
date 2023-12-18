import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int total = A + B + C;
    int min = Math.min(Math.min(A,B),Math.min(B,C));
    int max = Math.max(Math.max(A,B),Math.max(B,C));
    int middle = total - min - max;
    int ans =0;
    ans = max - middle;
    min += ans;
    ans += (max - min) / 2;
    if ((max - min) % 2 == 1) ans+=2;
    System.out.println(ans);
  }
}    