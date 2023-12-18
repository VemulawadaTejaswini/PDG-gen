import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    for (int a = 1; a <= 9; a ++) {
      for (int b = 1; b <= 9; b ++) {
        int total = a * b;
        if (N == total) {
          System.out.println("Yes");
        }
      }
    }
    System.out.println("NO");
  }
}