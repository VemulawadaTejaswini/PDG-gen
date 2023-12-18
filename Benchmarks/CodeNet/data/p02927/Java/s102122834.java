import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.next());//int型
        int D = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;
        for(int j = 1; j <= M; j++) {
            for (int i = 1; i <= D; i++) {
                int d1 = i % 10;
                int d10 = i / 10;
                if (d1 >= 2 && d10 >= 2 && j == d1 * d10) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
