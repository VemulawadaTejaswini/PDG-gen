import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a;
    int c = 0;
    int d;
    while (b>0) {
      c += (b % 10);
      b /= 10;
    }
    if (a % c == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
