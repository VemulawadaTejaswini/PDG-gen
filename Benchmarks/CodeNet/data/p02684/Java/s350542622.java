import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long k = cin.nextLong();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++) {
            arr[i-1] =  cin.nextInt();
        }
        k = k % cycle(arr);
        int res = 1;
        for (int i = 0; i<k; i++) {
            res = arr[res-1];
        }
        System.out.print(res);
    }

    static int cycle(int[] arr) {
        int[] l = new int[arr.length];
        int start = 1;
        int count = 0;
        while (l[start-1]==0) {
            l[start-1] = count;
            start = arr[start -1];
            count++;
        }
        return count-l[start-1];
    }
}
