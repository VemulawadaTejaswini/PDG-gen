import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] sunuke = new boolean[N];
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int A = sc.nextInt();
                sunuke[A - 1] = true;
            }
        }
        int counter = 0;
        for (int i = 0; i < sunuke.length; i++) {
            if (sunuke[i] == false) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}