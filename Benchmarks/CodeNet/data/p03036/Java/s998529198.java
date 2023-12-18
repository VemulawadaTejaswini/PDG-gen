
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int r = cin.nextInt();
    int D = cin.nextInt();
    long start = cin.nextLong();

    for (int i=0;i<10;i++) {
      start = r*start-D;
      System.out.println(start);
    }

  }

}
