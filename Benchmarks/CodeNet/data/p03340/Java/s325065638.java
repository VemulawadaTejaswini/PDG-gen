import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextLong();

        int cnt = 0;
        int leftIdx = 0;
        long curSum = 0;
        long curXOR = 0;
        for(int i = 0; i < n; i++) {
        	curSum += arr[i];
        	curXOR ^= arr[i];
        	while(curSum != curXOR) {
        		long leftNum = arr[leftIdx++];
        		curSum -= leftNum;
        		curXOR ^= leftNum;
        	}
        	cnt += i - leftIdx + 1;
        }
        System.out.println(cnt);
    }
}
