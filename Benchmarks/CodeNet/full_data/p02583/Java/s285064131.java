
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long lengths[] = new long[n];
        for(int i = 0; i < n; ++i) {
            lengths[i] = s.nextInt();
        }
        int count =0;
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n ; ++j) {
                for(int k = j+1; k < n; ++k) {
                    if(lengths[i] == lengths[j] || lengths[i] == lengths[k] || lengths[j] == lengths[k])
                        continue;
                    if(lengths[i] + lengths[j] > lengths [k] &&
                            lengths[i] + lengths[k] > lengths[j] &&
                            lengths[k] + lengths[j] > lengths[i])
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
