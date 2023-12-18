import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int plus = a + b;
    int minus = a - b;
    int times = a * b;
    
    if(plus > times && plus > minus) {
      System.out.println(plus);
    } else if(minus > plus && minus > times) {
      System.out.println(minus);
    } else {
      System.out.println(times);
    }
  }
}