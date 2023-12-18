import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
	int c = scanner.nextInt();
    
    String sa = String.valueOf(a);
    String sb = String.valueOf(b);
    String sc = String.valueOf(c);
    
    int ab = Integer.parseInt(sa + sb);
    int bc = Integer.parseInt(sb + sc);
    int ca = Integer.parseInt(sc + sa);
    
    if (a >= b && b >= c) {
      System.out.println(ab + c);
    } else if (a >= c && c >= b) {
      System.out.println(ca + b);
    } else if (b >= a && a >= c) {
      System.out.println(ab + c);
    } else if (b >= c && c >= a) {
      System.out.println(bc + a);
    } else if (c >= a && a >= b) {
      System.out.println(ca + b);
    } else if (c >= b && b >= a) {
      System.out.println(bc + a);
    }
  }
}