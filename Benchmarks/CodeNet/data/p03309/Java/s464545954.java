import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> medianList = new ArrayList<>();
        int temp = 0;
        for (int i = 1; i <= N; i++) {
            temp = sc.nextInt() - i;
            medianList.add(temp);
        }

        Collections.sort(medianList);

        int sub = 0;
        if (N % 2 == 1) {
            sub = medianList.get(N / 2);
        } else {
            sub = ((medianList.get(N / 2 - 1) + medianList.get(N / 2))) / 2;
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.abs(medianList.get(i) - sub);
        }

        System.out.println(sum);

        sc.close();

    }
}
