import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }



        for (int i = 0; i < n; i++) {
            long sum = 0;
            int start = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                sum += Math.abs(list[j] - start);
                start = list[j];
            }
            sum += Math.abs(start);
            System.out.println(sum);
        }


    }
}