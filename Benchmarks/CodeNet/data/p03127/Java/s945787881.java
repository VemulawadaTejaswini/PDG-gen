import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        int index = 0;
        long min = list[0];

        parent : while (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }
                    long value = list[i] % list[j];
                    if (value > 0 && value < min) {
                        index = j;
                        min = value;
                    }
                    if (min == 1) {
                        break parent;
                    }
                }
            }
            if (list[index] == min) {
                break;
            } else {
                list[index] = min;
            }

        }

        System.out.println(min);
    }
}