import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] a = new int[n];
    static int[] b = new int[n];
    static int[] c = new int[n];

    public static void main(String[] args){
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i=0; i<n; i++) b[i] = sc.nextInt();
        Arrays.sort(b);
        for (int i=0; i<n; i++) c[i] = sc.nextInt();
        Arrays.sort(c);

        long ans = 0;

        for (int i=0; i<n; i++){
            long low = lowerbound(a, b[i]);
//            long high = lowerbound(c, b[i]+1);

            int high = upperbound(c, b[i]);
            long tmp = low*(n-high);
            ans += tmp;
        }

        System.out.println(ans);

    }

    private static int lowerbound(int[] x, int y){
        int left = 0;
        int right = n;
        while (left<right){
            int mid = (left+right)/2;
            if (x[mid]<y){
                left = mid+1;
            }else {
                right = mid;
            }
        }
//        System.out.println(left);
        return left;
    }

    private static int upperbound(int[] x, int y){
        int left = 0;
        int right = n;
        while (left<right){
            int mid = (left+right)/2;
            if (x[mid]<=y){
                left = mid+1;
            }else {
                right = mid;
            }
        }
//        System.out.println(left);
        return left;
    }
}