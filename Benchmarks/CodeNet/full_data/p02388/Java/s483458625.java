import static java.lang.System.out;
import java.util.Scanner;
  
class Main {
    public void main( String... args) {
        String x = new Scanner( System.in).nextLine();
        int input = Integer.parseInt( x);
        out.println( x * x * x);
    }
}