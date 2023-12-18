import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long ans = 0;
    for (int a = 1; a <= k; a++) {
      for (int b = 1; b <= k; b++) {
        for (int c= 1; c <= k; c++) {
          int temp = Main.gcd(a, b);
          ans += Main.gcd(temp, c);
        }
      }
    }
 
    System.out.println(ans);
  }

  private static int gcd (int a, int b) {
    if (b > a) {
      int x = a;
      a = b;
      b = x;
    }
    
    int temp;
    while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
  }

}