import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();

        Integer[] color = {R, G, B};
        Arrays.sort(color, Collections.reverseOrder());
        int x = color[0];
        int y = color[1];
        int z = color[2];

        int cnt = 0;
        for (int i=0; i*x<=n; i++) {
            for (int j=0; (i*x)+(j*y)<=n; j++) {
                for (int k = 0; (i * x) + (j * y) + (k * z) <= n; k++) {
                    if (n == (i * x) + (j * y) + (k * z)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}