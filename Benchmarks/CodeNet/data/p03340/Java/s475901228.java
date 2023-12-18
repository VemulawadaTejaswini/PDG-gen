import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(a[i]);
        }

        long count = 1;
        int work = array[0];
        int start = 0;
        int current = 1;

        while (current < N) {
            if ((work & array[current]) == 0) {
                work ^= array[current];
                ++current;
                count += current - start;
            } else {
                work ^= array[start];
                ++start;
            }
        }

         System.out.println(count);
    }
}