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

        int criteria;
        if (avg % 1 == 0) {
            criteria = (int)avg;
        } else {
            criteria = (int)avg + 1;
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
