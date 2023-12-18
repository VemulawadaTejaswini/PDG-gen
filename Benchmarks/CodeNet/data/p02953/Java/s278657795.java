import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = sc.nextInt();
        }
        boolean success = true;
        int max = height[0];
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > height[i + 1]) {
                height[i]--;
                if (height[i] > height[i + 1] || max > height[i]) {
                    success = false;
                    break;
                } else {
                    max = height[i];
                }
            }
        }
        if (success) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
