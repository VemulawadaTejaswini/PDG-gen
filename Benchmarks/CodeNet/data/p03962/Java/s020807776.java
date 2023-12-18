import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        int[] num = new int[100];
        num[a]++;
        num[b]++;
        num[c]++;
        sc.close();

        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            if (num[i] != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}