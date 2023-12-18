
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = in.nextInt();
            pair[i][1] = in.nextInt();
        }

        Arrays.sort(pair, Comparator.comparingInt(o -> o[1]));

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pair[i][0];
            if(sum > pair[i][1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}