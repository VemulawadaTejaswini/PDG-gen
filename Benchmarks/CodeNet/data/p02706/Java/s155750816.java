import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long array[] = new long[m];

        for (int i = 0; i < m; i++) {
            array[i] = sc.nextLong();
        }

        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += array[i];
        }

        if(n - sum < 0) {
            System.out.println("-1");
        } else {
            System.out.println(n - sum);
        }

        sc.close();
    }

}