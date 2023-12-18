import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args)  {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);
    int max = cin.nextInt();
    int mul = cin.nextInt();

    if (mul%2==0){
      int start = mul/2;
      int time = max/start;
      int res = 0;
      if (time%2==0){
        res = (int)Math.pow((time/2),3)*2;
      }
      else {
        res = (int)Math.pow(time/2+1,3)+(int)Math.pow(time/2,3);
      }
      System.out.println(res);
    }

    else {
      int time = max / mul;
      int res = (int)Math.pow(time,3);
      System.out.println(res);
    }

  }

}
