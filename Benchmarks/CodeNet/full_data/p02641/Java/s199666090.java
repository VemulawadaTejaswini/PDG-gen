import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int nowMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (!list.contains(x)) {
            System.out.println(x);
            return;
        }
        int min = x - 1;
        int max = x + 1;
        while (true) {
            if (!list.contains(min)) {
                System.out.println(min);
                return;
            }
            min--;
            if (!list.contains(max)) {
                System.out.println(max);
                return;
            }
            max++;
        }
    }
}