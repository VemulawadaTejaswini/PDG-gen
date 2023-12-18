import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num[] = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            num[i] = m;
            total += m;
        }

        float avg = (float)total / (float)n;

        Arrays.sort(num);

        int average;
        if (avg % 1 == 0) {
            average = (int)avg;
        } else {
            average = (int)avg + 1;
        }

        int median =
                n > 2 ? num[(n%2==0 ? n/2 + 1 : n/2)]
                        : (n > 1 ? Math.min(num[0], num[1])
                                    :num[0]);

        int criteria = average;
        if(average < median) {
            criteria = median;
        }
        
        int cost = 0;
        for (int i = 0; i < n; i++) {
            if(num[i] != criteria) {
                cost += Math.pow((num[i] - criteria), 2);
            }
        }

        System.out.println(cost);
    }
}
