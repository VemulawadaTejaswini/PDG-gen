
// 問題URL
// https://atcoder.jp/contests/abc131/tasks/abc131_a

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ar = str.split("");
        int[] iar = Stream.of(ar).mapToInt(Integer::parseInt).toArray();

        boolean flag = false;
        for(int i =0; i < 4; i++) {
            for(int j =i; j < iar.length; j++) {
                if ( i == j) continue;
                if(iar[i] == iar[j]) {
                    flag = true;
                }
                break;
            }
        }
        if(flag) {
            System.out.println("Bad");
        }else {
            System.out.println("Good");
        }
    }
}