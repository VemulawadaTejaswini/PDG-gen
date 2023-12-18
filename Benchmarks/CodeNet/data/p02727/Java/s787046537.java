

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());

        int[] p = new int[a];
        for (int i = 0; i < a; i++) {
            p[i] = Integer.parseInt(scan.next());
        }

        int[] q = new int[b];
        for (int i = 0; i < b; i++) {
            q[i] = Integer.parseInt(scan.next());
        }

        int[] r = new int[c];
        for (int i = 0; i < c; i++) {
            r[i] = Integer.parseInt(scan.next());
        }

        scan.close();

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        List<Integer> answerList = new LinkedList<Integer>();
        for (int i = 0; i < x; i++) {
            answerList.add(p[a - 1 - i]);
        }
        for (int i = 0; i < y; i++) {
            answerList.add(q[b - 1 - i]);
        }
        Collections.sort(answerList);

        int removeCount = 0;
        for (int i = 0; i < c; i++) {
            if (answerList.get(c - 1 - i) < r[i]) {
                removeCount = c - i;
                break;
            }
        }

        for (int i = 0; i < removeCount; i++) {
            answerList.remove(0);
        }
        for (int i = 0; i < removeCount; i++) {
            answerList.add(r[c - 1 - i]);
        }

        int ans = 0;
        for (int i = 0; i < x + y; i++) {
            ans += answerList.get(i);
        }

        System.out.println(ans);
    }

}
