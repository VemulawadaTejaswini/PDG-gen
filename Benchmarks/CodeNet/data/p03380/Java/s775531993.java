import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int m = array[n - 1];

        int idea = 0;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            int v = Math.min(array[i], m - array[i]);
            if (v > idea) {
                idea = v;
                c = array[i];
            }
        }

        System.out.println(m + " " + c);
    }
}