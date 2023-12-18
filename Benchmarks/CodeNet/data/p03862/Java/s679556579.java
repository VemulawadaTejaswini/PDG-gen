import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String inputArray[] = br.readLine().split(" ");
        final int N = Integer.parseInt(inputArray[0]);
        final int x = Integer.parseInt(inputArray[1]);
        inputArray = br.readLine().split(" ");
        int prev = 0;
        long sum = 0L;
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(inputArray[i]);
            if (prev+a>x) {
                int diff = prev+a-x;
                prev = a-diff;
                sum += diff;
            } else {
                prev = a;
            }
        }
        System.out.println(sum);
    }}
