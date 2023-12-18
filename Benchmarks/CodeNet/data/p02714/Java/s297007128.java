import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        char[] RGBs = S.toCharArray();

        long ans = 0;
        for (int i = 0; i < input - 2; i++) {
            for (int l = i + 1; l < input - 1; l++) {
                for (int m = l + 1; m < input; m++) {
                    if (RGBs[i] != RGBs[l] && RGBs[l] != RGBs[m] && RGBs[m] != RGBs[i]) {
                        if (l - i != m - l) {
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.println(ans);

    }

}
