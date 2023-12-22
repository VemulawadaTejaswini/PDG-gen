import static java.lang.System.out;
import java.util.Scanner;
 
public class Main {
    public void main( String... args) {
        int input = new Scanner( System.in).nextLine();
        input = Integer.parseInt( input);
        out.println( input * input * input);
    }
 
    int power( int num, int index) {
        if ( index == 0) {
            return 1;
        }
        if ( index < 2) {
            return num;
        }
        return num * power( num, index -1);
    }
}