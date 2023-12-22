import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long v = sc.nextLong();
    long b = sc.nextLong();
    long w = sc.nextLong();
    long t = sc.nextLong();
    if(v <= w){
      System.out.println("NO");
      return;
    }
    long distance = Math.abs(a - b);
    long speed = Math.abs(v - w);
    if(distance > t * speed){
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
  }
}