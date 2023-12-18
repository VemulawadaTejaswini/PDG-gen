import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }
        
        int min = Arrays.stream(as).min().getAsInt();
        int max = Arrays.stream(as).max().getAsInt();
        System.out.println(max - min);
    }
}
