import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();

    int moveA = a + v * t;
    int moveB = b + w * t;
    if(moveA > moveB){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}