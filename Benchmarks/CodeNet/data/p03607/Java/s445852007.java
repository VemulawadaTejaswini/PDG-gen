import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] a = new boolean[1000000010];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            if (a[index]) {
                a[index] = false;
                cnt--;
            } else {
                a[index] = true;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}