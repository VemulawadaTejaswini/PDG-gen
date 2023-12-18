import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int countFive = 0;
    int countSeven = 0;
    if (a == 5) {
      countFive ++;
    } else {
      countSeven ++;
    }
    if (b == 5) {
      countFive ++;
    } else {
      countSeven ++;
    }
    if (c == 5) {
      countFive ++;
    } else {
      countSeven ++;
    }
    
    if (countFive == 5) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}