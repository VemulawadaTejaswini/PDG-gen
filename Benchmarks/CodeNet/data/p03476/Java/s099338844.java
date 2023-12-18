import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int[] count_2017like = new int[500005];
        count_2017like[0] = 0;
        count_2017like[1] = 0;
        count_2017like[2] = 0;
        
        boolean prime = true;
        for (int i = 3; i <= 500000; i += 2) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                for (int k = 2; k <= Math.sqrt((i+1)/2); k++) {
                    if ((i+1)/2 % k == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    count_2017like[i] = count_2017like[i-2] + 1;
                }
            }
            if (!prime) {
                count_2017like[i] = count_2017like[i-2];
            }
            prime = true;
        }
        
        /*System.out.println(count_2017like[5]);
        System.out.println(count_2017like[7]);
        System.out.println(count_2017like[9]);
        System.out.println(count_2017like[11]);
        System.out.println("");*/
        
        for (int i = 0; i < q; i++) {
            String[] lr = br.readLine().split(" ");
            int l = Integer.parseInt(lr[0]);
            if (l < 2) l++;
            int r = Integer.parseInt(lr[1]);
            if (r < 2) r++;
            System.out.println(count_2017like[r]-count_2017like[l-2]);
            //System.out.println(count_2017like[3]);
        }
    }
}
