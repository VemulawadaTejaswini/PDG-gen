import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int notax = (int)Math.round(N / 1.08);
    if(notax * 1.08 == N) {
      System.out.println(notax);
    } else {
      System.out.println(":(");
    }
  }
}
