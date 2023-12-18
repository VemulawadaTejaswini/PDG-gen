import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];
        int maxIndex = 0;
        for (int i = 0; sc.hasNext(); i++) {
            p[i] = sc.nextInt();
            if (p[i] > p[maxIndex]) {
                maxIndex = i;
            }
        }

        int out = p[maxIndex] / 2;
        p[maxIndex] = 0;

        System.out.println(Arrays.stream(p).sum() + out);
    }
}