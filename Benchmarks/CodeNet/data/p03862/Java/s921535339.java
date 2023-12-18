import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();

        int cnt = 0;
        for(int i = 1; i < n; i++) {
        	int sum = arr[i-1] + arr[i];
        	int diff = Math.max(0, sum - x);
        	cnt += diff;
        	arr[i] -= Math.min(arr[i], diff);
        }
        System.out.println(cnt);
    }
}
