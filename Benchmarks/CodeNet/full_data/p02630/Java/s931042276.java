import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int b = scan.nextInt();
            int c = scan.nextInt();
            int sum = 0;
            for (int i = 0; i < num; i++) {
                if (arr[i] == b) {
                    arr[i] = c;
                    sum += c;
                } else
                    sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
