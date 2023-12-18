import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine().split(" ")[1]);
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        System.out.println(getMinimizeOperationCount(k, n));
    }

    protected static int getMinimizeOperationCount(int k, int n) {
        int count = 0;
        count += (n - 1) / (k - 1);
        if ((n - 1) % (k - 1) != 0) {
            count++;
        }
        return count;
    }
}