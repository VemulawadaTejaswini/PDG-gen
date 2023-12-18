import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            boolean[] useColors = new boolean[3200 / 8];
            int over3200 = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= 3200) {
                    over3200++;
                } else {
                    useColors[a / 400] = true;
                }
            }
            int useColorsCount = 0;
            for (boolean use : useColors) {
                if (use) useColorsCount++;
            }
            if (useColorsCount == 0) useColorsCount++;
            System.out.printf("%s %s", useColorsCount, useColorsCount + over3200);
        }
    }
}
