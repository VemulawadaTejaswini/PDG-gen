import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counst = 0;
        boolean[] exists = new boolean[8];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a < 3200) {
                exists[a / 400] = true;
            } else {
                counst++;
            }
        }
        int nkinds = 0;
        for (int i = 0; i < 8; i++) {
            if (exists[i]) {
                nkinds++;
            }
        }
        if (counst != 0) {
            System.out.println(Math.max(1, nkinds) + " " + (nkinds + counst));
        } else {
            System.out.println(nkinds + " " + nkinds);
        }
    }
}
