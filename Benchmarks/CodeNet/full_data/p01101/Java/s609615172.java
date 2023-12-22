
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        while (n != 0 || m != 0) {

            int toy[] = new int[n];
            for (int i = 0; i < n; i++) {
                toy[i] = scan.nextInt();
            }
            int max = 0;
            for (int d = 0; d < n; d++) {
                for (int g = 0; g < n; g++) {
                    if (d != g) {
                        int h = toy[d] + toy[g];
                        if (max < h && m >= h) {
                            max = h;

                        }
                    }
                }
            }
            if (max == 0) {
                System.out.println("NONE");
            } else {
                System.out.println(max);

            }
            n = scan.nextInt();
            m = scan.nextInt();

        }
    }
}

