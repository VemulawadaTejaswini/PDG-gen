import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        while (sc.hasNext()) {
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        int all = sum / (4 * m);

        String answer = "Yes";
        for (int i = 0; i < m; i++) {
            int tmp = list.get(i);

            if (tmp < all) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }

}
