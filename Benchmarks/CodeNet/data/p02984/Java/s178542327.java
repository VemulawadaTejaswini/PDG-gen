import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (input.hasNext()) {
            array[i] = input.nextInt();
            i++;
        }

        StringBuilder sb = new StringBuilder();
        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            result[0] += j % 2 == 0 ? 1 * array[j] : -1 * array[j];
        }
        sb.append(result[0] + " ");
        for (int k = 1; k < n; k++) {
            result[k] = 2 * array[k - 1] - result[k - 1];
            sb.append(result[k] + " ");
        }
        System.out.println(sb.toString().trim());
    }

}

