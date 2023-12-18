import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
        	arr[i][0] = sc.nextInt();
        	arr[i][1] = sc.nextInt();
        }
        long[] diff = new long[n];
        for(int i = 0; i < n; i++) {
        	diff[i] = arr[i][1] - arr[i][0];
        }
        int num = arr[n-1][1];
        while(num < arr[n-1][0]) {
              num +=  arr[n-1][1];
        }
        diff[n-1] = num - arr[n-1][0];
        for(int i = n-2; i >= 0; i--) {
        	long factor = (diff[i+1] - diff[i] + arr[i][1] - 1) / arr[i][1];
        	diff[i] = factor * arr[i][1] + diff[i];
        }
        System.out.println(diff[0]);
    }
}
