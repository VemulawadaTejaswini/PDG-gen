import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0  ; i < n ; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        long sum = arr[n-1];
        int j = n-2, x = 0;
        for(int i = n-3 ; i >= 0 ; i--, x++){
            if(x == 2){
                j--;
                x = 0;
            }
            sum += arr[j];
        }

        System.out.println(sum);
    }
}
