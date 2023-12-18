import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][3];
        String[] input = br.readLine().split(" ");
        arr[0][0] = Integer.parseInt(input[0]);
        arr[0][1] = Integer.parseInt(input[1]);
        arr[0][2] = Integer.parseInt(input[2]);
        for (int i = 1; i < n; i++) {
            input = br.readLine().split(" ");
            arr[i % 2][0] = Math.max(arr[(i - 1) % 2][1], arr[(i - 1) % 2][2]) + Integer.parseInt(input[0]);
            arr[i % 2][1] = Math.max(arr[(i - 1) % 2][0], arr[(i - 1) % 2][2]) + Integer.parseInt(input[1]);
            arr[i % 2][2] = Math.max(arr[(i - 1) % 2][0], arr[(i - 1) % 2][1]) + Integer.parseInt(input[2]);
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[(n - 1) % 2][i] > max) max = arr[(n - 1) % 2][i];
        }
        System.out.println(max);
    }
}
