import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i=0; i<n; i++) {
            for (int o=i+1; o<n; o++) {
                if (i + o == n) {
                    x++;
                }
            }
        }

        System.out.println(x);
    }
}
