import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        int highest = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
            if (i == 0) {
                highest = H[i];
                count++;
            } else {
                if (H[i] >= highest) {
                    count++;
                    if (H[i] > highest) {
                        highest = H[i];
                    } else {

                    }
                } else {

                }
            }
        }
        System.out.print(count);
    }
}