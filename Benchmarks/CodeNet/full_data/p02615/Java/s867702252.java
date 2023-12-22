import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Comparator.reverseOrder());
        long res = 0;
        res = arr[0];
        for(int i = 1; i < Math.floor(N/2); i++) {
            if(N%2==0) {
                res+=arr[i]*2;
            } else {
                if(i == 1) {
                    res += arr[i]*2;
                    res += arr[(int)Math.ceil(N/2)];
                } else {
                    res += arr[i] *2;
                }
            }
        }
        System.out.println(res);
    }
}
