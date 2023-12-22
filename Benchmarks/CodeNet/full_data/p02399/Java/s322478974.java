import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                long a = Long.parseLong(input[0]);
                long b = Long.parseLong(input[1]);
                
                long d = a / b;
                long r = a % b;
                double f = (double)a / (double)b;
                System.out.println(d + " " + r + " " + f);
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}