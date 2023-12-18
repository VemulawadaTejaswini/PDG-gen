import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(in.nextInt());

        int index = 0, cost = 0;
        for (int i : list) {
            cost += Math.abs(index - i);
            index = i;
        }
        cost += Math.abs(index);

        System.out.println(cost - Math.abs(list.get(0))
                - Math.abs(list.get(1) - list.get(0)) + Math.abs(list.get(1)));

        for (int i = 1; i < n - 1; i++) {
            System.out.println(cost - Math.abs(list.get(i - 1) - list.get(i))
            - Math.abs(list.get(i) - list.get(i + 1))
            + Math.abs(list.get(i - 1) - list.get(i + 1)));
        }

        System.out.println(cost - Math.abs(list.get(n - 1))
                - Math.abs(list.get(n - 1) - list.get(n - 2)) + Math.abs(list.get(n - 2)));
    }
}