import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ABCD = sc.nextLine().split(" ");
        int A = Integer.parseInt(ABCD[0]);
        int B = Integer.parseInt(ABCD[1]);
        int C = Integer.parseInt(ABCD[2]);
        int D = Integer.parseInt(ABCD[3]);

        int[] ans = new int[101];
        addTime(ans, A, B);
        addTime(ans, C, D);

        long count = Arrays.stream(ans).filter(s -> s > 1).count();
        System.out.println(count);
    }

    private static void addTime(int[] ans, int start, int stop) {
        for (; start < stop; start++) {
            ans[start]++;
        }
    }
}

