import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt() - (i + 1));
        }

        sc.close();

        Collections.sort(list);

        int sum = 0;
        int b = list.get(list.size() / 2);

        for (int i = 0; i < n; i++) {
            sum += Math.abs(list.get(i) - b);
        }

        System.out.println(sum);
    }
}