import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    if (a % 10 == 0) {
      System.out.println("NO");
    } else {
      System.out.println("Yes");
    }
  }
}