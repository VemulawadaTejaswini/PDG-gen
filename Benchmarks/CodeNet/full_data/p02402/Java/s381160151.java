import java.util.Scanner;

public class Main {        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000000;
        int min = 1000000;

        int n = sc.nextInt();
        int a = 0;
        long sum = 0;

        for (int i=n; i>0; --i) {
            if (n == 0) {
                break;
            }
            a = sc.nextInt();
            max = (max < a) ? a : max;
            min = (min > a) ? a : min;
            sum += a;
        }

        System.out.printf("%d %d %d\n", min, max, sum);
    }
}

