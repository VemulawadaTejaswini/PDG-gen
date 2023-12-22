import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            String[] s = in.readLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double C = Math.toRadians(Double.parseDouble(s[2]));

            double S = 0.5*a*b*Math.sin(C);
            double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
            double L = a + b + c;
            double h = 2*S/a;
            System.out.printf("%.8f\n", S);
            System.out.printf("%.8f\n", L);
            System.out.printf("%.8f\n", h);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

