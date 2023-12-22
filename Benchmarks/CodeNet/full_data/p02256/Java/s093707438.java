import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String input = new String(in.readLine());
      String[] inputArr = input.split(" ");
      int x = Integer.parseInt(inputArr[0]);
      int y = Integer.parseInt(inputArr[1]);
      if ( x > y ) {
        int tmp = x;
        x = y;
        y = tmp;
       }
       while ( x > 0 ) {
         int tmp = x;
         x = y % x;
         y = tmp;
       }
       System.out.println(y);
    } catch( IOException e ) {
    }
  }
}