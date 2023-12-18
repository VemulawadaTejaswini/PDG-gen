import java.util.*;

public class Main {
    public static int minIndexInArray (int[] array, List<Integer> list) {
        int min_val = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = (list.get(i)).intValue();
            if (min_val > array[index - 1]) {
                min_val = array[index - 1];
                min_index = index - 1;
            }
        }
        return min_index;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int deleted_ball = 0;

        List<Integer> ball = new ArrayList<Integer>();
        int [] each_ball = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            each_ball[num - 1]++;
            if (ball.indexOf(num) == -1) {
                ball.add(num);
            }
        }

        while (ball.size() > k) {
            int min_ball = minIndexInArray(each_ball, ball);
            deleted_ball += each_ball[min_ball];
            ball.remove(ball.indexOf(min_ball + 1));
        }

        System.out.println(deleted_ball);
    }
}