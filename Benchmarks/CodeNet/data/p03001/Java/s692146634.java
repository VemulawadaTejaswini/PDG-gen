
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int w = cin.nextInt();
    int h = cin.nextInt();
    int x = cin.nextInt();
    int y = cin.nextInt();

    int maxArea = w*h/2;

    if (x == w/2 && y == h/2) {
      System.out.println(maxArea + " 1");
    }
    else {
      System.out.println(maxArea + " 0");
    }


  }

}