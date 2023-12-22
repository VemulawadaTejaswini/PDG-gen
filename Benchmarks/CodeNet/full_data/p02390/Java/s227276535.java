import java.io.*;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    s = in.nextInt();
       int    h = s / 3600;
              s = s - 3600*h;
              m = s /60;
              s = s - 60s;

       System.out.println(h:m:s);
   }
} 