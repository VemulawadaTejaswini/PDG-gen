import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] point = input.split(" ");

        int x1 = Integer.parseInt(point[0]);
        int y1 = Integer.parseInt(point[1]);
        int x2 = Integer.parseInt(point[2]);
        int y2 = Integer.parseInt(point[3]);

        double x = x2 - x1;
        double y = y2 - y1;

        double distance = Math.sqrt(x * x + y * y);

        System.out.println(distance);
    }
}