import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        int start = n - 1;
        StringBuilder builder = new StringBuilder();

        boolean isDown = true;

        for (int i = 0; i < n; i++) {
            builder.append(list[start]);
            if (i != n - 1) {
                builder.append(" ");
            }
            if (start == 1 && isDown) {
                start = 0;
                isDown = false;
                continue;
            }
            if (start == 0 && isDown) {
                start = 1;
                isDown = false;
                continue;
            }
            if (isDown) {
                start -= 2;
            } else {
                start += 2;
            }
        }

        System.out.println(builder);
    }
}