import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] counts = {0, 0, 0};

        for(int i = 0; i < N; i++) {
            int P = sc.nextInt();
            if (P <= A) {
                counts[0] += 1;
            } else if (P <= B) {
                counts[1] += 1;
            } else {
                counts[2] += 1;
            }
        }

        System.out.println(Math.min(Math.min(counts[0], counts[1]), counts[2]));
    }
}
