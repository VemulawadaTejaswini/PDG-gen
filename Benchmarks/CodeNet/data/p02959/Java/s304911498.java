import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n + 1];
        int[] bn = new int[n];
        for (int i = 0; i < n + 1; i++) {
            an[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bn[i] = sc.nextInt();
        }
        sc.close();

        long count = 0;
        for (int i = 0; i < n; i++) {
            if (an[i] >= bn[i]) {
                count += bn[i];
                continue;
            } else {
                count += an[i];
                bn[i] = bn[i] - an[i];
            }
            if (an[i + 1] > bn[i]) {
                count += bn[i];
                an[i + 1] = an[i + 1] - bn[i];
            } else {
                count += an[i + 1];
                an[i + 1] = 0;
            }
        }
        System.out.println(count);
    }
}
