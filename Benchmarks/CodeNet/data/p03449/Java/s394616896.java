import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String str1[] = br.readLine().split(" ");
            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(str1[i]);
            }
            String str2[] = br.readLine().split(" ");
            int arr2[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(str2[i]);
            }
            int arr[] = new int[n];
            int index = 0;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp += arr1[i];
                arr[index++] = temp + getTotal(arr2, i);
            }
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getTotal(int arr[], int tmp) {
        int sum = 0;
        for (int i = tmp; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
