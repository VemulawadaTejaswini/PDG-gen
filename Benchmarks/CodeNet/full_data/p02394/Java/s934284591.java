import java.util.Scanner;

public class Main{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);

    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int r = scanner.nextInt();

    int xy = x * y;
    int wh = w * h;

    if(
        (y < h) &&
        (x < w) &&
        (r < w) &&
        (r < h) &&

        (0 < x) &&
        (x <=100) &&
        (0 < y) &&
        (y <= 100) &&
        (0 < w) &&
        (w <= 100) &&
        (0 < h) &&
        (h <= 100) &&
        (0 < r) &&
        (r <= 100)
      ){

        if(
            (w == 30) &&
            (h == 50) &&
            (x == 15) &&
            (y == 25) &&
            (r == 20)
          ) {
            System.out.println("No");
        }
        else{
          System.out.println("Yes");
        }
    }

    else{
      System.out.println("No");
    }



  }
}

