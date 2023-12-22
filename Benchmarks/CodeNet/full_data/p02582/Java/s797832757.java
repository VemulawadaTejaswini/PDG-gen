import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RainySeason {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.contains("RRR")) {
            System.out.println(3);
        } else if(s.contains("RR")) {
            System.out.println(2);
        } else if(s.contains("R")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}
