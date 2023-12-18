import java.util.Scanner;

public class Main {
    private static int digitSum(int input) {
        int output = 0;
        int tmp = 1;
        while (tmp <= input) {
            output += (input / tmp) % 10;
            tmp *= 10;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        String res = (val % digitSum(val) == 0) ? "Yes" : "No";
        System.out.println(res);

    }
}
