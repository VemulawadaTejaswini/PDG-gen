import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int total = 0;

        int min = h[0];


        for (int i = 0; i < n; i++) {
            if (h[i] == 0) {
                for (int j = 0; j < i; j++) {
                    if (min > h[i]) {
                        min = h[i];
                    }
                }
                for (int j = 0; j < i; j++) {
                    if (min > h[i]) {
                        min = h[i];
                    }
                }
            } else {

            }
        }


        System.out.println(total);
    }

}


#　配列の中で０にはさまれた要素について考える
#　その要素のなかの最小値を求め、それらの要素から最小値を引く
#　これを繰り返す
#　求めた最小値をすべてたす
#　それが求める答えである

#　メモ







