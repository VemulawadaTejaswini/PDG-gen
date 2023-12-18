import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] c = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < in.nextInt();c[Math.min(in.nextInt() / 400, 8)]++, i++);
        int sum = (int)Arrays.stream(Arrays.copyOf(c, 8)).filter(a -> a > 0).count();
        System.out.println((sum == 0 ? 1 : sum) + " " + (sum + c[8]));
    }
}