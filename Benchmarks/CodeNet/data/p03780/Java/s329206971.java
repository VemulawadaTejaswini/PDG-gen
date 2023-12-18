import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= k) {
                break;
            }

            int s = (i == 0 ? 1 : 0);
            int sum = a[i];
            boolean isNeed = false;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                sum += a[j];
                if (sum >= k) {
                    while (sum - a[s] >= k) {
                        sum -= a[s++];
                        if (s == i) {
                            s++;
                        }
                    }

                    if (sum - a[i] < k) {
                        isNeed = true;
                        break;
                    }
                }
            }

            if (!isNeed) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
