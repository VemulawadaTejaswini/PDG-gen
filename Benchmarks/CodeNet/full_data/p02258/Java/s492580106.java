import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] R = new int[n];

        for(int i = 0; i < n; i++){
            R[i] = Integer.parseInt(br.readLine());
        }
        int max = Integer.MIN_VALUE;
        int min = R[0];

        for(int i = 0; i < n; i++){
            max = Math.max(max, R[i] - min);
            min = Math.min(min, R[i]);
        }
        System.out.println(max);
    }
}