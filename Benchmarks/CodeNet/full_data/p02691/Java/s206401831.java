import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> spys = new ArrayList<>();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            for (int j = 0; j < spys.size(); j++) {
                if (i - j == spys.get(j) + temp) {
                    ans++;
                }
            }
            spys.add(temp);
        }
        scanner.close();

        System.out.println(ans);

    }
}
