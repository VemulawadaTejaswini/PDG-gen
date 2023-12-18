import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int x1 = scan.nextInt();
    int y1 = scan.nextInt();
    int x2 = scan.nextInt();
    int y2 = scan.nextInt();
    int dx = x2 - x1;
    int dy = y2 - y1;

    int x3 = x2 - dy;
    int y3 = y2 + dx;
    int x4 = x3 - dx;
    int y4 = y3 - dy;

    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

  }
}
