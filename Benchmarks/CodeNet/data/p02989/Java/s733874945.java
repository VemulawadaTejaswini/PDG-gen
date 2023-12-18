import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int cnt = 0;
        int max = 100000;
        int min = 1;
        List<Integer> sortAry = new ArrayList<>();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
            sum += ary[i];
        }
        int avg = sum / n;
        for (int hoge : ary) {
            if (hoge > avg) {
                cnt++;
            }
        }
        if (cnt != n/2) {
            System.out.println(0);
        } else {
            for (int hoge : ary) {
                if (hoge > avg && max > hoge) {
                    max = hoge;
                }
            }
            for (int hoge : ary) {
                if (hoge < avg && min < hoge) {
                    min = hoge;
                }
            }
            System.out.println(max - min);
        }
    }
}