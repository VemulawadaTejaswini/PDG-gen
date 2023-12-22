import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1, n, count;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (n = 1; n <= N; n++) {
            count = 0;
            for (i = 1; i <= Math.sqrt(n-5*(i*i)); i++) {
                for (j = i; j <= Math.sqrt(n - (i*i + 2*j*j + 2*i*j)); j++) {
                    for (k = j; k <= Math.sqrt(n - (i*i + j*j + i*j + j*k + k*i)); k++) {
                        if (i * (i + j) + j * (j + k) + k * (k + i) == n) {
                            if (i == j && j == k) {
                                count += 1;
                            } else if (i == j || j == k || k == i) {
                                count += 3;
                            } else {
                                count += 6;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}