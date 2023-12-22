import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n + 1];
        for(int i = 0 ; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] t = new int[q];
        for(int i = 0; i < q; i++) {
            t[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < q; i++) {
            if(binarySerch(s, n, t[i])) ans++;
        }

        System.out.println(ans);

        sc.close();
    }

    private static boolean binarySerch(int[] a, int n, int key) {
        int left = 0;
        int right = n;
        while(left < right) {
            int mid = (left + right) / 2;
            if(a[mid] == key) {
                return true;
            }else if(key < a[mid]) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        return false;
    }
}
