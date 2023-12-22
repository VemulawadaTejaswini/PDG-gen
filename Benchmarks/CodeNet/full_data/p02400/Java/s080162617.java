import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());
        
        double area = Math.PI * (r * r);
        double circumference = 2 * (Math.PI * r);
        
        System.out.printf("%6f %6f", area, circumference);
    }
}
