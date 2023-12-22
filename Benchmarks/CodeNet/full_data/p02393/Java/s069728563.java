
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String split[] = line.split(" ", 0);
        int sort[] = new int[3];
        int temp;

        sort[0] = Integer.parseInt(split[0]);
        sort[1] = Integer.parseInt(split[1]);
        sort[2] = Integer.parseInt(split[2]);

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 3; i++) {
                if (sort[i - 1] > sort[i]) {
                    temp = sort[i - 1];
                    sort[i - 1] = sort[i];
                    sort[i] = temp;
                }
            }
        }

        System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
    }
}