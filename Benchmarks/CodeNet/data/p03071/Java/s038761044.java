import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = 0;
    int result = 0;
    if (a != b) {
      t = Math.max(a,b);
      result = t + t - 1;
    } else {
      result = a + b;
    }
    System.out.println(result);
  }
}