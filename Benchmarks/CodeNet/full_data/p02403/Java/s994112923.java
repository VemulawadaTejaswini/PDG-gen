import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int y = Integer.parseInt(st[0]);
            int x = Integer.parseInt(st[1]);
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    bw.append("#");
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }


}
