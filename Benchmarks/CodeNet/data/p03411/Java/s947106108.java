import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] axR = new int[n];
        int[] ayR = new int[n];
        int[] axB = new int[n];
        int[] ayB = new int[n];
        
        for (int i = 0; i < n; i++) {
            axR[i] = sc.nextInt();
            ayR[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            axB[i] = sc.nextInt();
            ayB[i] = sc.nextInt();
        }
        
        int count = 0;
        boolean[] r = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int xB = axB[i];
            int yB = ayB[i];
            int tempJ = -1;
            int sumD = 1000;
            for (int j = 0; j < n; j++) {
                if (!r[j] && axR[j] < xB && ayR[j] < yB) {
                    int dx = xB - axR[j];
                    int dy = yB - ayR[j];
                    if (sumD > dx + dy) {
                        tempJ = j;
                        sumD = dx + dy;
                    }
                }
            }
            if (tempJ != -1) {
                r[tempJ] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
