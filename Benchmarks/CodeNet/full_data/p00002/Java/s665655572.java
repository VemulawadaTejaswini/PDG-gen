import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while( !(input = bufReader.readLine()).isEmpty() && input != null ) {
            String[] divideInput = input.split(" ");
            int a = Integer.parseInt( divideInput[0] ); 
            int b = Integer.parseInt( divideInput[1] );
            System.out.println(a + b);
        }
    }
}