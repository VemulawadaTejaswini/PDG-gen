import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    sc.close();

    int dx = 0;
    int dy = 0;

    if (x2 == x1){
      dx = y2 - y1;
      dy = y2 - y1;
      System.out.println((x2 - dx) + " " + y2 + " " + (x1 - dx) + " " + y1);
    } else if (y2 == y1){
      dx = x2 - x1;
      dy = x2 - x1;
      System.out.println(x2 + " " + (y2 + dy) + " " + x1 + " " + (y1 + dy));
    } else {
      dx = y2 - y1;
      dy = x2 - x1;
      System.out.println((x2 - dx) + " " + (y2 + dy) + " " + (x1 - dx) + " " + (y1 + dy));
    }

  }

}