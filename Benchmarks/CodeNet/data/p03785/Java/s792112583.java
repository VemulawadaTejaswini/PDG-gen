import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);

        int bus = 0, wait = 0;
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (wait == 0) {
                time = t[i];
                wait = 1;
            } else if (wait >= c || t[i] > time + k) {
                bus++;
                time = t[i];
                wait = 1;
            } else {
                wait++;
            }
        }
        if (wait > 0) {
            bus++;
        }

        System.out.println(bus);
    }
}
