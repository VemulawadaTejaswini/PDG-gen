import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner nyuryoku = new Scanner(System.in);
    int x = nyuryoku.nextInt();
    int y = nyuryoku.nextInt();
    int tmp;
    if (x < y){
      tmp = x;
      x = y;
      y = tmp;
    }
    System.out.println(gcd(x, y));
  }
  public static int gcd(int x, int y){
    if (x == 0) return y;
    if (x == y) return x;
    return gcd(y%x, x);
  }
}
