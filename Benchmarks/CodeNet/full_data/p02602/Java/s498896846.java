import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = k - 1; i < n; i++) {
            //int tmp = a.get(i) * a.get(i - 1) * a.get(i - 2);
            int tmp = 1;
            for (int j = 0; j < k; j++) {
                tmp *= a.get(i - j);

            }
            score.add(tmp);
        }
        for (int i = 0; i < (n - k); i++) {
            if (score.get(i) < score.get(i + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

}
