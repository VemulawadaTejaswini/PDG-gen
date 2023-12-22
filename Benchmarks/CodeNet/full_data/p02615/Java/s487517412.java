import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[]arr = new long[N];
        long ans = 0;
        for(int i = 0;i < N;i++){
            ans += arr[i / 2 + 1];
        }
        System.out.println(ans);
    }
}