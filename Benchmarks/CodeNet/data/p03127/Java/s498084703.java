import java.util.*;
import java.util.ArrayList;z
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        while (a.size() > 2) {
            Collections.sort(a);
            for (int i = 1; i < a.size(); i++) {
                int hoo = a.get(i) % a.get(0);
                a.set(i, hoo);
            }
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) == 0) {
                    a.remove(i);
                }
            }
        }
        System.out.println(a.get(0));
    }
}





