import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] point = input.split(" ");

        double x1 = Double.parseDouble(point[0]);
        double y1 = Double.parseDouble(point[1]);
        double x2 = Double.parseDouble(point[2]);
        double y2 = Double.parseDouble(point[3]);

        double x = x2 - x1;
        double y = y2 - y1;

        double distance = Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2));

        System.out.println(distance);
    }
}