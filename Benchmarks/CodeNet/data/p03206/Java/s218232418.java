
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    String res;
    int in = cin.nextInt();

    if (in==25) {
      res = "Christmas";
    }
    else if (in==24) {
      res = "Christmas Eve";
    }
    else if (in==23) {
      res = "Christmas Eve Eve";
    }
    else {
      res = "Christmas Eve Eve Eve";
    }
    System.out.println(res);

  }

}
