import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();

        Integer a[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = stdin.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        int count = 1;

        for (int i = 0; i < N - 1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
