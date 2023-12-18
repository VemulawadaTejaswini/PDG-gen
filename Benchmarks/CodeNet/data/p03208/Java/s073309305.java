import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        int[] tmp = new int[k];

        for (int i = 0; sc.hasNext(); i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        for (int i = 0; i < h.length; i++) {
            if (tmp[k - 1] == 0) {
                tmp[i] = h[i];
            } else {
                if ((tmp[k - 1] - tmp[0]) >= (h[i] - tmp[1])) {
                    int[] copy = new int[k];
                    for (int c = 0; c < tmp.length - 1; c++) {
                        copy[c] = tmp[c + 1];
                    }
                    copy[k - 1] = h[i];
                    tmp = copy;
                }
            }
        }

        System.out.println((tmp[k - 1] - tmp[0]));
    }
}