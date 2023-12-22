import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer array[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0)  continue;
            if (i == 1) {
                ans += array[0];
                continue;
            }

            ans += array[Math.round(i/2)];

        }

        System.out.println(ans);




        sc.close();

    }

}