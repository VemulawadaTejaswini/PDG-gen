import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[] line;

        int[][] input = new int[n][3];

        for (int i = 0; i < n; i++) {
            line = reader.readLine().split(" ");
            input[i][0] = Integer.parseInt(line[0]);
            input[i][1] = Integer.parseInt(line[1]);
            input[i][2] = Integer.parseInt(line[2]);
        }


        for (int i = 1; i < n; i++) {

            input[i][0] = Math.max(input[i-1][1], input[i-1][2]) + input[i][0];
            input[i][1] = Math.max(input[i-1][0], input[i-1][2]) + input[i][1];
            input[i][2] = Math.max(input[i-1][0], input[i-1][1]) + input[i][2];

        }

        System.out.println(Arrays.stream(input[n-1]).max().getAsInt());


    }
}
