// Binary Search
import java.util.*;
import java.lang.*;

public class Main {
    
    static int n;
    static int[] s;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int count = 0;
        for (int i = 0; i < q; i++) {
            if (binarySearch(sc.nextInt())) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    static boolean binarySearch(int target) {
        int right = n - 1;
        int left = 0;
        int pointer = (left + right) / 2;
        while (right >= left) {
            pointer = (left + right) / 2;
            if (target == s[pointer]) {
                return true;
            } else if (target < s[pointer]) {
                right = pointer - 1;
            } else {
                left = pointer + 1;
            }
        }
        return false;
    }
}
