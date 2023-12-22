
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String data = reader.readLine();
        String[] number = data.split(" ");
        int count = 0;
        for (int i = Integer.parseInt(number[0]) ; i <= Integer.parseInt(number[1]) ; i++) {
            if ( (Integer.parseInt(number[2]) % i ) == 0) {
                count++;
            }
        }
        System.out.println (count);
    }
}