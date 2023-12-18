import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        double ave = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ave += x;
            list.add(x);
        }

        ave = Math.round(ave / n);

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.pow(list.get(i) - ave, 2);
        }

        System.out.println(result);
    }
}