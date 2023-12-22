import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int[] l = new int[3];
            l[0] = in.nextInt();
            l[1] = in.nextInt();
            l[2] = in.nextInt();
            Arrays.sort(l);
            if (l[0] * l[0] + l[1] * l[1] == l[2] * l[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}