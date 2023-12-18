

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        Long[] A = new Long[x];
        Long[] B = new Long[y];
        Long[] C = new Long[z];
        for (int i = 0; i < x; i++) A[i] = sc.nextLong();
        for (int i = 0; i < y; i++) B[i] = sc.nextLong();
        for (int i = 0; i < z; i++) C[i] = sc.nextLong();
        List<Long> abc = new ArrayList<>();
        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                if (a * b > k) break;
                for (int c = 0; c < z; c++) {
                    if (a * b * c > k) break;
                    abc.add(A[a] + B[b] + C[c]);
                }
            }
        }
        abc.sort(Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
