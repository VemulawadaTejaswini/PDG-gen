import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int bill = 1000;
      int currAmount = 0;
      while (currAmount < N) {

          currAmount += bill;


      }
      System.out.println(currAmount-N);
  }

}
