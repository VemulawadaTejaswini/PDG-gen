import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void draw_one(int i, int j)
  {
    if((i+j)%2==0) System.out.print("#");
    else System.out.print(".");
  }
  public static void draw(int a, int b)
  {
    for(int i = 0; i < a; i++)
    {
      for (int j = 0; j < b; j++) {
        draw_one(i,j);
      }
      System.out.println();
    }
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    while(true)
    {
      int a = scan.nextInt();
      int b = scan.nextInt();
      if(a ==0 && b == 0) break;
      draw(a,b);
      System.out.println();
    }
    scan.close();
  }
}

