import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int[] values = new int[2];
        values[0] = Integer.parseInt(tokenizer.nextToken());
        values[1] = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int index = 0;
        for (int i = 0; i < k; i++) {

            if (values[index] % 2 != 0)
                values[index]--;


            int amounts = values[index] / 2;
            values[index] -= amounts;
            index++;
            index = index % 2;

            values[index] += amounts;
        }


        System.out.println(values[0] + " " + values[1]);

    }
}
