import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] hl = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            hl[i] = 0;
        }
        for (int i = 0; i < n-1; i++) {
            if (h[i] > h[i+1]) {
                h[i] -= 1;
                hl[i] = 1;
                if (i != 0) {
                    for (int j = i; j >= 1; j--) {
                        if (h[j-1] > h[j]) {
                            if (hl[j-1] != 0) {
                                System.out.println("No");
                                System.exit(0);
                            } else {
                                if (h[j-1] - h[j] > 1) {
                                    System.out.println("No");
                                    System.exit(0);
                                } else {
                                    h[j-1] -= 1;
                                    hl[j-1] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Yes");
    }

}
