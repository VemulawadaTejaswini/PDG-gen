
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int oddCount = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1)
                oddCount++;
        }

        System.out.println((double) oddCount / N);


    }
}


