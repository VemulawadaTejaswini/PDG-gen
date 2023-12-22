import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] temp = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                temp[i] = sc.nextInt();
            }
            Arrays.sort(temp);
            for (int i = 1; i < n - 1; i++) {
                sum += temp[i];
            }
            System.out.println(sum / (n - 2));
        }
    }
}