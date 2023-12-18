
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    String in = cin.next();
    char[] temp = in.toCharArray();
    int count = 0;

    for (char a : temp) {

      if (a == '0') count++;

    }

    int res = in.length() - count >= count ? count * 2 : (in.length() - count) * 2;

    System.out.println(res);


  }

}
