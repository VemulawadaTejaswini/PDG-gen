
//18:48

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        List<Integer> b = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!b.contains(a[i])) {
                b.add(a[i]);
                ans++;
            } else {
                b.remove(b.size() - 1);
                ans--;
            }
        }
        System.out.println(b.size());

    }
}