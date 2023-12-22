import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwzheng on 2017/3/27.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(Reader.readLine());
        String A[] = Reader.readLine().split(" ",0);
        int[] arr = new int[N];
        for (int i=0; i < N; i++){
            arr[i] = Integer.parseInt(A[i]);
        }
        bubbleSort(arr,N);
    }

    private static void bubbleSort(int[] arr, int n) {
        boolean flag = true;
        int exCount = 0;
        while (flag){
            flag = false;
            for (int i = n - 1; i > 0; i--){
                if (arr[i] < arr[i-1]){
                    exch(arr,i,i-1);
                    exCount++;
                    flag = true;
                }
            }
        }
        String str = "";
        for (int i = 0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        System.out.println(str.substring(0,str.length()-1));
        System.out.println(exCount);
    }

    private static void exch(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}