import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
      String s = scanner.next();

      if( s.length() <= k ) {
          System.out.println( s );
      }else if( s.length() > k ) {
          String sk = s.substring( 0 , k );
          System.out.println( sk + "...");
      }


      scanner.close();
    }

}