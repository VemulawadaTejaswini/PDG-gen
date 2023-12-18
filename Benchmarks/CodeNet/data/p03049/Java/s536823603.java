
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();

    int res = 0;
    int concateA = 0;
    int concateB = 0;
    for (int i=0;i<n;i++) {
      String line = cin.next();

      int fromIndex = 0;

      while ((fromIndex = line.indexOf("AB", fromIndex)) != -1 ){
//        System.out.println("Found at index: " + fromIndex);
        res++;
        fromIndex++;
      }

      if (line.lastIndexOf('A') == line.length()-1)
        concateA++;
      if (line.indexOf('B') == 0)
        concateB++;
    }
//    System.out.println("A "+concateA+" B "+concateB);
    if (concateA==n&&concateB==n) {
      System.out.println(res+n-1);
    }
    else {
      res = res + Math.min(concateA, concateB);
      System.out.println(res);
    }

  }

}