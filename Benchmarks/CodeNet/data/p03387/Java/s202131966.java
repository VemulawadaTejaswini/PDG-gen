
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = solve(a, b, c);
        System.out.println(answer);
    }

    private static int solve(int a, int b, int c) {
        Integer[] array = new Integer[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array, Collections.reverseOrder());
        int count = 0;
        int deg = array[0] - array[1];
        count += deg;
        int deg2 = array[0] - (array[2] + deg);
        count += deg2 / 2;
        if (deg2 % 2 == 1) {
            count += 2;
        }
        return count;
    }


}
