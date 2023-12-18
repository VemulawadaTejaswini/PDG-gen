import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int[] res = new int[]{-1, -1, -1};
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (i * 10000 + j * 5000 + (N - i - j) * 1000 == Y) {
                    res[0] = i;
                    res[1] = j;
                    res[2] = N - i - j;
                }
            }
        } 
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
}
