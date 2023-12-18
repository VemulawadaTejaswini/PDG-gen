import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n];
        for(int i = 0;i < n;i++) h[i] = sc.nextLong();
        boolean[] isGoodTower = new boolean[n];
        for(int i = 0;i < n;i++) isGoodTower[i] = true;
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0;i < m;i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        for(int i = 0;i < m;i++) {
            long aH = h[a[i]];
            long bH = h[b[i]];
            
            if(aH < bH) {
                isGoodTower[a[i]] = false;
            }
            else if(aH == bH) {
                isGoodTower[a[i]] = false;
                isGoodTower[b[i]] = false;
            }
            else {
                isGoodTower[b[i]] = false;
            }
        }

        int count = 0;
        for(int i = 0;i < isGoodTower.length;i++) {
            if(isGoodTower[i]) count++;
        }
        
        System.out.println(count);
    }
}
