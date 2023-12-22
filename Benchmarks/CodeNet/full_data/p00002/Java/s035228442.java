import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwzheng on 2017/3/27.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
        while (Reader.readLine() != null){
            String A[] = Reader.readLine().split(" ",0);
            int[] arr = new int[A.length];
            for (int i=0; i < arr.length; i++){
                arr[i] = Integer.parseInt(A[i]);
            }
            int sum = arr[0] + arr[1];
            int k = 0;
            while ((sum / ((int)Math.pow(10,k)) != 0)){
                k++;
            }
            System.out.println(k);
        }
    }
}