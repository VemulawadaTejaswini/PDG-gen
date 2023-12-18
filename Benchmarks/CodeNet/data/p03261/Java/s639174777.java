
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);

    int times = cin.nextInt();

    HashSet<String> set = new HashSet<>();

    String pre = "";

    for (int i=0;i<times;i++){

      String item = cin.next();

      if (i==0) {
        set.add(item);
        pre = item;
      }
      else {
        if (item.charAt(0)!=pre.charAt(pre.length()-1)) {
          System.out.println("No");
          return;
        }
        else {
          if (set.contains(item)) {
            System.out.println("No");
            return;
          }
          else {
            set.add(item);
            pre = item;
          }
        }
      }
    }

    System.out.println("Yes");

  }


}