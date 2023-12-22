import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
		double x = a * 2 * Math.PI;
        double y = a * a * Math.PI;
        System.out.println(String.format("%.6f", y) + " " + String.format("%.6f", x));

    }
}


