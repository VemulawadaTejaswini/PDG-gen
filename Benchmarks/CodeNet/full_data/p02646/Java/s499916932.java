import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    if(v <= w){
      System.out.println("NO");
      return;
    }
    int distance = Math.abs(a - b);
    int speed = Math.abs(v - w);
    if(distance > t * speed){
      System.out.println("NO");
    }
    System.out.println("YES");
  }
}