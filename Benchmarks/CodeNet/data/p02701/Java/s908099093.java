// 問題URL
// https://atcoder.jp/contests/abc164/tasks/abc164_c

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Set<String> x= new HashSet<>();

        for(int i = 0; i < a; i++) {
            x.add(scanner.next());
        }
        System.out.println(x.size());
    }
}
