

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
        ArrayList<Integer> xx = new ArrayList<>(x);
        Collections.sort(xx);

        for (int i = 0; i < n; i++) {
            int tmp = x.get(i);
            ArrayList<Integer> xxx = new ArrayList<>(xx);
            xxx.remove(Integer.valueOf(tmp));
            int tmp2 = xxx.get((n - 1) / 2);
            System.out.println(tmp2);
        }

    }
}