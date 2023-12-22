

import java.util.Scanner;

class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            int[] page = new int[N];
            for (int i = 0; i < N; ++i) {
                page[i] = sc.nextInt();
            }
            int start = 0;
            for (int i = 1; i < N; ++i) {
                if (page[i] == page[i - 1] + 1) {
                    continue;
                }
                if (i == start + 1) {
                    System.out.print(page[start] + " ");
                } else {
                    System.out.print(page[start] + "-" + page[i - 1] + " ");
                }
                start = i;
            }
            if (start == N - 1) {
                System.out.println(page[start]);
            } else {
                System.out.println(page[start] + "-" + page[N - 1]);
            }
        }
    }
}

