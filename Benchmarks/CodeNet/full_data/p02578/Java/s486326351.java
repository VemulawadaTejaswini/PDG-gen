// 提出時に消す
// package app;

import java.util.Scanner;
import java.util.stream.IntStream;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = IntStream.range(0, n).map(e -> sc.nextInt()).toArray();

        int total = 0;
        int height = a[0];

        for (int i = 1; i < n; i++) {
            if (height > a[i]) {
                total += height - a[i];
            } else {
                height = a[i];
            }
        }

        System.out.println(total);

        sc.close();
    }
}