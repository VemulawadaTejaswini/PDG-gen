import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -2000000000;
        int min = arr[0];
        for(int i = 1; i < num - 1; i++) {
            max = Math.max(max, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        System.out.println(max);
    }
}