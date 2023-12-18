import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int arr[] = {1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484, 512, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1000};
            int x = Integer.parseInt(br.readLine());
            for (int i = arr.length -1 ; i >= 0; i--) {
                if (x >= arr[i]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
