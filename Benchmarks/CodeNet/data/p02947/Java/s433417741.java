// 問題URL
// https://atcoder.jp/contests/abc137/tasks/abc137_c

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        String[] str  = new String[N];
        Arrays.setAll(str, i ->  scanner.next());

        char ar[][] = new char[N][];
        for(int i =0; i < N; i++) {
            ar[i] = str[i].toCharArray();
            Arrays.sort(ar[i]);
        }
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                if(i >= j) continue;
                if(Arrays.equals(ar[i], ar[j])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
