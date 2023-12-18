import java.util.Scanner;

public class Main {
    public static int N = 0;
    public static int[] H;
    public static String output = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int[] decrement = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            decrement[i] = H[i + 1] - H[i];
        }

        int decCount = 0;
        boolean valley = false;
        for (int i = 0; i < decrement.length; i++) {
            if (decrement[i] < 0) decCount++;
            if (decrement[i] < -1) {
                valley = true;
                break;
            }
        }
        if (decCount > 1 || valley) output = "No";
        else output = "Yes";

        System.out.println(output);
    }
}