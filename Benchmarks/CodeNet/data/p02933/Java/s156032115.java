// 問題URL
// https://atcoder.jp/contests/abc138/tasks/abc138_a

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        String x = scanner.next();

        if (n >= 3200) {
            System.out.println(x);
        } else {
            System.out.println("red");
        }

    }
}