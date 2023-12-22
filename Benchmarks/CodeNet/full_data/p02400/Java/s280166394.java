import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        double r;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            r = Double.parseDouble(br.readLine());
        }

        double s = Math.PI * r * r;
        double l = 2 * Math.PI * r;

        System.out.printf("%f %f%n", s, l);
    }
}

