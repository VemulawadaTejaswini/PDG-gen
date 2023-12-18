import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] Di;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Di = new long[N];
            for (int i = 0; i < Di.length; i++) {
                Di[i] = sc.nextLong();

            }
        }

        long result = 0;
        for (int i = 0; i < Di.length; i++) {
            for (int j = i+1; j < Di.length; j++) {
                result += Di[i] * Di[j];

            }
        }

        System.out.println(result);
    }

}
