import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(sc.next());
        }

        int ans = 1000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                ans = Math.min(ans, data[i] + data[j]);
            }
        }
        System.out.print(ans);
    }

}