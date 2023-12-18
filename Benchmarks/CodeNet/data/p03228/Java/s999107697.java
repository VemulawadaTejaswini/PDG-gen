
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

 //   Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();
    int k = cin.nextInt();

    for (int i=0;i<k;i++){
      if (i%2==0) {
        if (a%2==1) {
          a--;
          a = a/2;
          b +=a;
        }
        else {
          a = a/2;
          b +=a;
        }
      }
      else {
        if (b%2==1) {
          b--;
          b = b/2;
          a +=b;
        }
        else {
          b = b/2;
          a +=b;
        }
      }

    }

    System.out.println(a + " " + b);
  }

}
