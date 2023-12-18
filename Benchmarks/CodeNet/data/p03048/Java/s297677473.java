
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int r = cin.nextInt();
    int g = cin.nextInt();
    int b = cin.nextInt();
    int n = cin.nextInt();
//    int record = n;
    int res = 0;
    for (int i = 0; i <= n / r; i++) {
      int remainedTwo = n - i * r;

      for (int j = 0; j <= remainedTwo / g; j++) {
        int remainedOne = remainedTwo - j * g;
//        System.out.println(i+" "+j+" "+remainedOne/b);
        if (remainedOne % b == 0){
          res++;
        }
      }
    }
    System.out.println(res);

  }

}
