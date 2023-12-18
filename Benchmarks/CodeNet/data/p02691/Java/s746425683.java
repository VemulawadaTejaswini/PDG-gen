import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Harry on 5/3/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap();
        int res =0;
        for(int i=0; i<n; i++){
            int save = i+h[i];
            int find = i-h[i];
            freq.put(save, freq.getOrDefault(save, 0)+1);
            res += freq.getOrDefault(find, 0);

        }
        System.out.println(res);
    }
}
