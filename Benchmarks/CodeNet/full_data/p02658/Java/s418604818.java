import java.util.Scanner;
public class Main {
    public static final long MAX_VALUE = 1000000000000000000L;
    public static long solve(long [] arr) {
        long result = 1L;
        for (long value : arr) {
            if (value == 0) return 0;

            result = result * value;
            if (result > MAX_VALUE) return -1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        long [] arr = new long[n];
        for(int i = 0; i<n ; i++) {
            arr[i] = sn.nextLong();
            if(arr[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(solve(arr));
    }
}