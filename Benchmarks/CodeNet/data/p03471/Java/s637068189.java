import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                for (int k = 0;; k++) {
                    if (n == (10000*i + 5000*j + 1000*k)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
