import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = scan.nextInt();
        System.out.println(solve(x));
    }
    public static int solve(int x) {
        int upper = (int) Math.floor(Math.sqrt(x));
        int answer = 0;
        for (int i = 1; i <= upper; i++) {
            for (int j = 1; j <= 10; j++) {
                int target = (int) Math.pow(i, j);
                if (x < target) {
                    break;
                }
                if (target <= x && answer < target) {
                    answer = target;
                }
                if (i == 1) {
                    break;
                }
            }
        }
        return answer;
    }
}
