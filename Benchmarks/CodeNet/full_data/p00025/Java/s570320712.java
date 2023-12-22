import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        while (sc.hasNext()) {
            int a[] = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = sc.nextInt();
            }
            int hit = 0, blow = 0;
            for (int i = 0; i < 4; i++) {
                int b = sc.nextInt();
                for (int j = 0; j < 4; j++) {
                    if (a[j] == b) {
                        if (i == j) {
                            hit++;
                        } else {
                            blow++;
                        }
                        continue;
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}
