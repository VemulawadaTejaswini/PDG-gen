import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[] array = toArray(N);

            int max = 0;
            int count = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == array[i]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
            System.out.println(max >= 3 ? "Yes" : "No");
        }
    }

    private static int[] toArray(int n) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }
}
