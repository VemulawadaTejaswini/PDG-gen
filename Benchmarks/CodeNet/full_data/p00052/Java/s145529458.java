import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      int sum = 0;
      while(true) {
        if (n == 0) {
          break;
        }
        n /= 5;
        sum += n;
      }
      System.out.println(sum);
    }
  }
}