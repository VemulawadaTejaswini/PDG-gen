import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          
          int c = a/b;
          int d = a%b;
          
          double e;
          e = a/b;
          String s = String.format("%.5f",e);

          System.out.println(c + " " + d + " " + s);
     }
}