import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e;
    int f;
    int g;

    int w = a+c;
    int x = a+d;
    int y = b+c;
    int z = b+d;

    e = Math.min(w,x);
    f = Math.min(e,y);
    g = Math.min(f,z);
    System.out.println(g);
  }
}
