import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    fn(0,0,0,0);
    System.out.println(count);
  }
  static int count = 0;
  static int N;
  public static void fn(long num, int a, int b, int c){
    if (a != 0 && b != 0 && c != 0 && num<= N) {
      count++;
    }
    if (num <= N) {
      if (num*10 <N) {
        fn(num*10+3,a+1,b,c);
        fn(num*10+5,a,b+1,c);
        fn(num*10+7,a,b,c+1);
      }
    }
  }
}