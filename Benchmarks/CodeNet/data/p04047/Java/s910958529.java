import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] values = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            values[i] = input.nextInt();
        }
        Arrays.sort(values);
        int sum = 0;
        for (int i = 1; i < n * 2; i+=2) {
            sum += Math.min(values[i], values[i - 1]);
        }
        System.out.println(sum);
    }
}
