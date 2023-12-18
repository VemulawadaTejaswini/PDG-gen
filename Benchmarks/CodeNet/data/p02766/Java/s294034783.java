import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int d = 0;
    int count = 0;
    boolean b = true;
    while(b){
      d = N / K;
      N = d;
      count++;
      if(d == 1){
          count++;
          b = false;
      }
    }
    System.out.println(count);
  }
}
