import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int[] faceToEast = new int[n];
        int[] faceToWest = new int[n];
        Arrays.fill(faceToEast, 0);
        Arrays.fill(faceToWest, 0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                faceToEast[i]++;
            } else {
                faceToWest[i]++;
            }
        }

        for (int i = 1; i < n; i++) {
            faceToEast[i] += faceToEast[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            faceToWest[i] += faceToWest[i + 1];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int incorrectDirection = n - 1;
            if (i - 1 >=0) {
                incorrectDirection -= faceToEast[i - 1];
            }
            if (i + 1 < n - 1) {
                incorrectDirection -= faceToWest[i + 1];
            }

            ans = Math.min(ans, incorrectDirection);
        }

        System.out.println(ans);
    }
}