import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[4000];
        for (int i = 0 ; i < 4000 ; i++) {
            a[i] = i * (i + 1) / 2;
        }

        List<Integer> ans = new ArrayList<>();
        while (n > 0) {
            int i = 0;
            while (a[i] < n) {
                i++;
            }
            ans.add(i);
            n -= i;
        }
        for (int i = ans.size() - 1 ; i >= 0 ; i--) {
            System.out.println(ans.get(i));
        }



    }

    static void searchNum(int n, int[] a, List<Integer> ans) {
        int i = 0;
        while (a[i] <= n) {
            i++;
        }
        ans.add(i);
        n -= i;
    }

}