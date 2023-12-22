import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine().trim());


        while (testCases > 0) {
            reader.readLine();
            long[] arr = Arrays.stream(reader.readLine().split(" "))
                    .map(String::trim)
                    .mapToLong(Long::parseLong)
                    .toArray();

            long[] turns = Arrays.stream(reader.readLine().split(""))
                    .map(String::trim)
                    .mapToLong(Long::parseLong)
                    .toArray();

            long x = 0;
            for (int i = 0; i < turns.length; i++) {
                if (turns[i] == 0) {
                    if ((x ^ arr[i]) == 0)
                        x = x ^ arr[i];
                } else {
                    if ((x ^ arr[i]) > 0)
                        x = x ^ arr[i];
                }
            }

            if (x > 0)
                System.out.println(1);
            else
                System.out.println(0);

            testCases--;
        }
    }
}