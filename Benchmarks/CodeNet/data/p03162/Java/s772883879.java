import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int n = Integer.parseInt(st.nextToken());

        long[][] happinessOptions = new long[n][3];

        int[] chosenOption = new int[n]; // record which activity has been chosen, a: 0, b: 1, c: 2

        long[] maxHappiness = new long[n]; // maximum happiness on ith day


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < 3; j++) {
                long k = Long.parseLong(st.nextToken());
                happinessOptions[i][j] = k;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (happinessOptions[0][i] > maxHappiness[0]){
                maxHappiness[0] = happinessOptions[0][i];
                chosenOption[0] = i;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != chosenOption[i - 1] && happinessOptions[i][j] + maxHappiness[i - 1] > maxHappiness[i]) {
                    maxHappiness[i] = happinessOptions[i][j] + maxHappiness[i - 1];
                    chosenOption[i] = j;
                }
            }
        }

        System.out.println(maxHappiness[maxHappiness.length - 1]);
    }
}