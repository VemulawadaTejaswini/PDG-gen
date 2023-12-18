import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long leftMax = -1, rightMin = 10000000;
        for(int i = 0; i < m; i++) {
            leftMax = Math.max(leftMax, sc.nextInt());
            rightMin = Math.min(rightMin, sc.nextInt());
        }
        System.out.println(rightMin - leftMax + 1);
    }
}
