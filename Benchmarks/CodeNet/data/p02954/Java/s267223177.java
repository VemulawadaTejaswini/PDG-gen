import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int n = s.length();

            boolean[] ss = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    ss[i] = true;
                } else {
                    ss[i] = false;
                }
            }

            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                if (ss[i] == true) {
                    for (int j = i + 1; j < n; j++) {
                        if (ss[j] == false) {
                            c[j - 1] += (j - i + 1) / 2;
                            c[j] += (j - i) / 2;
                            i = j - 1;
                            break;
                        }
                    }
                } else {
                    for (int j = i - 1; j >= 0; j--) {
                        if (ss[j] == true) {
                            if ((i - j) % 2 == 1) {
                                c[j + 1]++;
                            } else {
                                c[j]++;
                            }
                            break;
                        }
                    }
                }
            }

            System.out.print(c[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(" " + c[i]);
            }
        }
    }

}
