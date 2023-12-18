import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    // 入力値の読み込み
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong()-1;
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    
    long A_C = A / C; // Cの個数
    long A_D = A / D; // Dの個数
    long A_CD = A / lcm(C, D); //最小公倍数
    long cntA = A_C + A_D - A_CD;
    
    long B_C = B / C; // Cの個数
    long B_D = B / D; // Dの個数
    long B_CD = B / lcm(C, D); //最小公倍数
    long cntB = B_C + B_D - B_CD;
    System.out.println(B - A - (cntB - cntA));
  }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
  }
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }
  
}