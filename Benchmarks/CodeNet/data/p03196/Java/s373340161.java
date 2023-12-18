
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    long n = cin.nextLong();
    long p = cin.nextLong();

    long root = (long)Math.pow(p,(double)1/n);
    //System.out.println(root);

    while (root >= 1) {
      long sq = (long)Math.pow(root,n);
      if (p%sq==0) {
        System.out.println(root);
        return;
      }
      else root--;
    }

  }

}
