
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    String item = "keyence";
    String in = cin.next();

    int jump = 0;
    int yes = 0;

    for (int i=0;i<item.length();i++) {
      String a = item.substring(0,i+1);
      String b = item.substring(i+1,item.length());
      int posA = in.indexOf(a);
      int posB = in.indexOf(b);
      if (posA==-1) continue;
      else if (posB==-1) continue;
      else {
        System.out.println("YES");
        return;
      }

    }
    System.out.println("NO");

  }

}