import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] split = reader.readLine().split(" ");
        for(int i = 0; i <  split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int ans = 0;
        for(int i =0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                for(int p = j + 1; p < arr.length; p++) {
                    if(arr[i] == arr[j] || arr[i] == arr[p] || arr[j] == arr[p]) {
                        continue;
                    }
                    if(arr[i] < arr[j] + arr[p] && arr[j] < arr[p] + arr[i] && arr[p] < arr[i] + arr[j]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
