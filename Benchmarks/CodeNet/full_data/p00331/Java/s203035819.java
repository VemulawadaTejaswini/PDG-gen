import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int r = sc.nextInt();
    if (h + r > 0)
    System.out.println(1);
    if (h + r == 0)
    System.out.println(0);
    if (h + r < 0)
    System.out.println(-1);
  }
}
