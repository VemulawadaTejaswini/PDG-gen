
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        double r = Integer.parseInt(line);
        
        double S = r * r * Math.PI;
        double l = 2 * r * Math.PI;
        
        System.out.println(String.format("%8f", S) + " " + String.format("%8f", l));
    }
    
}

