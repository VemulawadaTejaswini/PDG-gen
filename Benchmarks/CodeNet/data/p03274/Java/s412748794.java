import java.util.*;

public class Main {
    private static int minDistance = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n - k; i++) {
            checkMinDistance(array[i], array[i + k - 1]);
        }
        if(minDistance == Integer.MAX_VALUE) minDistance = 0;
        System.out.println(minDistance);
    }
    private static void checkMinDistance(int min, int max) {
        if(max < 0) {
            minDistance = Math.min(minDistance, -min);
        } else if(min >= 0) {
            minDistance = Math.min(minDistance, max);
        } else {
            minDistance = Math.min(minDistance, -min + Math.abs(min - max));
            minDistance = Math.min(minDistance, max + Math.abs(max - min));
        }
    }
}