

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        final int [][] edges = new int[20][20];
        final int [] pow = new int[20];
        int i = 0;
        int largest = 0;
        while (L > 0) {
            pow[i] = L % 2;
            if (pow[i] == 1) {
                largest = i;
            }
            L /= 2;
            ++i;
        }
//        for (i = 0; i < 20; ++i) {
//            System.out.println("pow[" + i + "]: " + pow[i]);
//        }
//        System.out.println("largest: " + largest);
        int edgeNum = 0;
        for (i = 0; i < largest; ++i) {
            edges[i][i + 1] = 2;
            edgeNum += 2;
        }

        for (i = largest - 1; i >= 0; --i) {
            if (pow[i] == 1) {
                edges[i][largest]++;
                ++edgeNum;
            }
        }
        System.out.println(largest + 1 + " " + edgeNum);
        for (i = 0; i <= largest; ++i) {
            for (int j = i; j <= largest; ++j) {
                if (edges[i][j] > 0) {
                    for (int k = 0; k < edges[i][j]; ++k) {
                        System.out.println((i + 1) + " " + (j + 1) + " 1");
                    }
                }
            }
        }
    }
}
