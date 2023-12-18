import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int l[] = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int total = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (total <= x) {
                total += l[i];
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l[i];
        }
        if (sum <= x) {
            System.out.println(count + 1);
        } else {
            System.out.println(count);
        }
    }
}

