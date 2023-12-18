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
                    if (h[i-1] > h[i]) {
                        if (hl[i-1] != 0) {
                            System.out.println("No");
                            System.exit(0);
                        } else {
                            if (h[i-1] - h[i] > 1) {
                                System.out.println("No");
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Yes");
    }

}
