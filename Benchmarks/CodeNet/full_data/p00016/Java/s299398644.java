import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        double x = 0, y = 0;
        double pai = Math.acos(-1);
        int ang = 0;
        while ((line = in.readLine()) != null) {
            String[] strs = line.split(",");
            int x1 = Integer.parseInt(strs[0]);
            int y1 = Integer.parseInt(strs[1]);
            if (x1 == 0 && y1 == 0) {
                break;
            }
            x += x1 * Math.sin(pai * ang / 180);
            y += x1 * Math.cos(pai * ang / 180);
            ang += y1;
        }

        System.out.println((int)x);
        System.out.println((int)y);
    }
}

