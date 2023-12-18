import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int highest = 0;
        int highestIndex = 0;
        boolean isYes = true;
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = in.nextInt();
            sum += items[i];
        }
        for (int i = 0; i < m; i++) {
            highest = 0;
            highestIndex = 0;
            for (int j = 0; j < n; j++) {
                if (items[j] > highest) {
                    highest = items[j];
                    highestIndex = j;
                }
            }
            items[highestIndex] = 0;
            if (highest < sum/(4*m)) {
                isYes = false;
                System.out.println("No");
                break;
            }
        }
        if (isYes) {
            System.out.println("Yes");
        }
        in.close();
    }
}