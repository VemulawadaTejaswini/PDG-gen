import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        String[] list = reader.readLine().split(" ");
        int[] arr = new int[N];
        for(int i= 0;i<N;i++){
            arr[i] =Integer.parseInt(list[i]);
        }
        int[] arrc = new int[N];

        for(int i= 0;i<N;i++){
            arrc[i] =Integer.parseInt(list[i]);
        }
        long lcm = LCM(arrc,N);
        long sum = 0;
        for(int i1 = 0 ;i1<N;i1++){
            sum=sum+ (lcm/(arr[i1]));
            if(sum>=1000000007) sum%=1000000007;

        }
        System.out.println(sum);
    }
    public static long LCM(int arr[], int n) {
        // Find the maximum value in arr[]
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            if (max_num < arr[i]) {
                max_num = arr[i];
            }
        }

        // Initialize result
        long res = 1;

        // Find all factors that are present in
        // two or more array elements.
        int x = 2; // Current factor.
        while (x <= max_num) {
            // To store indexes of all array
            // elements that are divisible by x.
            Vector<Integer> indexes = new Vector<>();
            for (int j = 0; j < n; j++) {
                if (arr[j] % x == 0) {
                    indexes.add(indexes.size(), j);
                }
            }

            // If there are 2 or more array elements
            // that are divisible by x.
            if (indexes.size() >= 2) {
                // Reduce all array elements divisible
                // by x.
                for (int j = 0; j < indexes.size(); j++) {
                    arr[indexes.get(j)] = arr[indexes.get(j)] / x;
                }

                res = res * x;
            } else {
                x++;
            }
        }

        // Then multiply all reduced array elements
        for (int i = 0; i < n; i++) {
            res = res * arr[i];
        }

        return res;


    }}
