import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] strings = new String[4];
        strings = line.split(" ");
        int[] ints = new int[4];
        for (int i = 0; i < 4; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        int A = ints[0];

        int B = ints[1];

        int H = ints[2];

        int M = ints[3];

        H =  H % 12;
        double Hr = H * 30 + 0.5 * M;
        double Mr = M * 6.0;

        double cha = Math.abs(Hr - Mr);


        double jiaoducha = Math.toRadians(cha);
        double cq  = A*A + B*B - 2 * A * B * Math.cos(jiaoducha);

        double c = Math.sqrt(cq);
        System.out.println(c);

    }
}
