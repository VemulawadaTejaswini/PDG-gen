import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

class SortingThreeNumbers {

    private int[] data;

    SortingThreeNumbers(int... data) {
        this.data = Arrays.copyOf(data, data.length);
        sort(this.data);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int num : data) {
            str.append(String.format("%d ", num));
        }
        return str.toString().trim();
    }

    // ?????´?£?????????????
    public static int[] sorted(int... data) {
        int[] copy = Arrays.copyOf(data, data.length); // ???????????????????£?????????????????????????????????????
        sort(copy);

        return copy;
    }

    // ??´?£?????????????
    private static void sort(int... data) {
        // bouble sort
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        out.println(new SortingThreeNumbers(a, b, c));
    }
}