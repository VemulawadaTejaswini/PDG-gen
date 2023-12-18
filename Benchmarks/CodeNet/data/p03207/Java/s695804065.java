import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer p[] = new Integer[n];
        Integer max = 0;
        Integer maxPos = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            if (max < p[i]) {
                max = p[i];
                maxPos = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (maxPos == i) {
                p[i] /= 2;
            }
            sum += p[i];
        }
        System.out.println(sum);
    }
}

