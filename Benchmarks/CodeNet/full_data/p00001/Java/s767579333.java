import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int N = 10;
        int M = 3;
        int height[] = new int[N];
        int ans[] = new int[N];
        //String str[] = new String[N];

        // 処理
        for (int i = 0; i < N; i++) {
            // 入力
            //System.out.print("input : ");
            height[i] = scanner.nextInt();
           
            //str[i] = scanner.nextLine();

            //System.out.print("output : ");
            //System.out.println(height[i]);
        }

        Arrays.sort(height);
        
        for (int i = 1; i <= M; i++) {
            System.out.println(height[N - i]);
        }

        scanner.close();
    }
}
