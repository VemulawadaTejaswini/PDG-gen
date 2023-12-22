
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long check = 1000000000000000000L;

    public static void main(String[] args) {
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        long ans = 1;
        for (int i = 0; i < n; i++){
            long tmp = ans;
            ans *= arr[i];
            if (ans < 0 || ans < tmp){
                ans = -1;
                break;
            }
        }
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                ans = 0;
                break;
            }
        }
        if (ans > check){
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
