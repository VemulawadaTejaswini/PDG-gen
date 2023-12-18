import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = 100000;

        for (int i=1; i<N; i++) {
            int A = i;
            int B = N - i;
            int AB = Main.calc(A) + Main.calc(B);
            min = min < AB ? min : AB;
        }

        System.out.println(min);
    }

    static int calc(int a) {
        int[] nums = {100000, 10000, 1000, 100, 10, 1};
        int sum = 0;

        for (int num : nums) {
            sum += a / num;
            a = a % num;
        }
        return sum;
    }
}

