import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        int h = 0;

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (name.charAt(0) == 'M') {
                m++;
            } else if (name.charAt(0) == 'A') {
                a++;
            } else if (name.charAt(0) == 'R') {
                r++;
            } else if (name.charAt(0) == 'C') {
                c++;
            } else if (name.charAt(0) == 'H') {
                h++;
            }
        }
        sc.close();

        int[] d = {m, a, r, c, h};
        int p = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                for (int k = j+1; k < 5; k++) {
                    if (d[i] * d[j] * d[k] > 0) {
                        p += d[i] * d[j] * d[k];
                    }
                }
            }
        }
        System.out.println(p);
    }
}
