import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int count = Integer.parseInt(s.next());
        int[] values = new int[count];

        int answer = 1;
        for (int i = 0; i < count; i++) {
            int tmp = Integer.parseInt(s.next());
            if (tmp % 2 == 1) {
                System.out.println(0);
                return;
            }
            values[i] = tmp / 2;
        }



        int zeroCount = 0;
        while (zeroCount != count) {
            zeroCount = 0;
            for (int i = 0; i < count; i++) {
                int tmp = values[i];
                if (tmp == 0) {
                    zeroCount++;
                    continue;
                }
                if (tmp % 2 == 1) {
                    System.out.println(answer);
                    return;
                }
                values[i] /= 2;
            }

            answer++;
        }

        System.out.println(answer);
    }
}