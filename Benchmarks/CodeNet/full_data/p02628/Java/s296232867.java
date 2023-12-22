
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static void solve(int[] arr, int numberOfBrokeAss) {
      Arrays.sort(arr);
      int result = 0;
      for(int i = 0; i<numberOfBrokeAss; i++){
        result+=arr[i];
      }
      System.out.println(result);
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int parameter = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
            	arr[i] = in.nextInt();
        	}
      		solve(arr,parameter);

    }
}