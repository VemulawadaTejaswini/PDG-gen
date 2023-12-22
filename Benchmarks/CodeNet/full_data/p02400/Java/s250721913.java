import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.valueOf(br.readLine());
        
        double pi = 3.14159265358979;
        
        String square = String.format("%.06f", r * r * pi);
        String round = String.format("%.06f", 2 * pi * r);
        
        System.out.println(square + " " + round);
    }
}
