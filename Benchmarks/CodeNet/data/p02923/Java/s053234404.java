import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[n-1-i] = sc.nextInt();
        }
        int max = 0;
        int idx = 0;
        while(idx < n) {
        	int cnt = 0;
        	while(idx+1 < n && arr[idx] <= arr[idx+1]) {
        		cnt++;
        		idx++;
        	}
        	max = Math.max(max, cnt);
        	idx++;
        }
        System.out.println(max);
    }
}
