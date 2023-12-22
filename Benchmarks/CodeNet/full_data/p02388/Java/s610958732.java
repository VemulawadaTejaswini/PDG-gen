import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;

        try {
            x = Integer.parseInt(in.readLine());

        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println((int) Math.pow((double) x, 3d));
    }
}