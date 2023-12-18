import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int h[] = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        boolean mizuyari = true;
        int count = 0;
        while (mizuyari) {
            mizuyari = false;
            for (int i = 0; i < N; i++) {
                if (h[i] > 0) {
                    mizuyari = true;
                    h[i] = h[i] - 1;
                }
            }
            if (mizuyari) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}