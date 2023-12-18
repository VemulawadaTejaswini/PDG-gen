import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n2 = 0, n4 = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0) {
                n4++;
            } else if (a % 2 == 0) {
                n2++;
            }
        }
        int max = n4 * 2 + n2;
        if (n2 == 0) {
            max++;
        }
        if (max < N) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
