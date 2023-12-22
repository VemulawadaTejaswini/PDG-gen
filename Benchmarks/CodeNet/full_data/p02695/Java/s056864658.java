import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[] aArr = new int[q];
        int[] bArr = new int[q];
        int[] cArr = new int[q];
        int[] dArr = new int[q];
        for (int i = 0; i < q; i++) {
            aArr[i] = sc.nextInt() - 1;
            bArr[i] = sc.nextInt() - 1;
            cArr[i] = sc.nextInt();
            dArr[i] = sc.nextInt();
        }
        Nums nums = new Nums(n, m);
        int max = 0;
        while (nums.next()) {
            int sum = 0;
            for (int i = 0; i < q; i++) {
                sum += nums.get(aArr[i], bArr[i], cArr[i], dArr[i]);
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
    
    static class Nums {
        int[] arr;
        int length;
        int size;
        
        public Nums(int length, int size) {
            this.length = length;
            this.size = size;
            arr = new int[length];
            Arrays.fill(arr, 1);
            arr[length - 1] = 0;
        }
        
        public boolean next() {
            return next(length - 1);
        }
        
        public boolean next(int idx) {
            if (arr[idx] >= size) {
                if (idx == 0) {
                    return false;
                }
                if (next(idx - 1)) {
                    arr[idx] = arr[idx - 1];
                } else {
                    return false;
                }
            } else {
                arr[idx]++;
            }
            return true;
        }
        
        public int get(int left, int right, int value, int point) {
            if (arr[right] - arr[left] == value) {
                return point;
            } else {
                return 0;
            }
        }
    }
}