
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String str = "#";
        
        while(true){
            String data = reader.readLine();
            String[] number = data.split(" ");
            int x = Integer.parseInt(number[0]);
            int y = Integer.parseInt(number[1]);
            if (x == 0 && y == 0 ) {
                break;
            }
            for ( int c = 0; c < y ; c++) {
                System.out.println (StringUtils.repeat(str,x));
            }

            System.out.println ("");
            
        }
        
    }
}