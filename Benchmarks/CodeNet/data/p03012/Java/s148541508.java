import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int right, left;
        right = left = 0;
        ArrayList<Integer> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            w.add(num);
            right += num;
        }
        int min = 10000;
        left += w.get(0);
        right -= w.get(0);
        for (int i = 1; i < n; i++) {
            if (min > Math.abs(left - right)) {
                min = Math.abs(left - right);
            }
            left += w.get(i);
            right -= w.get(i);
        }

        System.out.println(min);
        return;
    }


}
