import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next()), M = Integer.parseInt(sc.next());
        int[] cards = new int[N];

        for (int i=0; i<M; i++) {
            int L = Integer.parseInt(sc.next()), R = Integer.parseInt(sc.next());
            for (int j=L-1; j<R; j++) {
                cards[j] += 1;
            }
        }
        int count = 0;
        for (int i=0; i<N; i++) {
            if (cards[i] == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}