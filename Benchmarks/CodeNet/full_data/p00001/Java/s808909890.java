import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hwzheng on 2016/12/13.
 */
public class Main {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];
        for (int i = 0; i < 10; i++){
            heights[i] = scanner.nextInt();
        }
        Arrays.sort(heights);
        for (int i = 0;i <3; i++){
            System.out.println(heights[9-i]);
        }
    }
}