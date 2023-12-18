import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long max = 0;
                    int ansA = 0;
            int ansB = 0;
        for(int i = 0; i < n; i++){
            int low = 0;
            int high = n - 1;
            int maxMid = 0;
            int temp = 100000;
            int target = (a[i] + 1) / 2;
            int mid = 0;
            while(low <= high){
                mid = (low + high) / 2;
                if(a[mid] == target){
                    maxMid = a[mid];
                } else if(Math.abs(target - a[mid]) < temp) {
                    temp = a[mid];
                }
                if(a[mid] > target){
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
                if(maxMid == 0){
                    temp = maxMid;
                }
                long x = calc(a[i], maxMid);
                if(x > max){
                    max = x;
                    ansA = a[i];
                    ansB = a[mid];
                }
        }
        System.out.print(ansA);
        System.out.print(" ");
        System.out.print(ansB);
    }
    static long calc(int n, int m){
            long c = 1;
    m = ( n - m < m ? n - m : m );
    for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
        c *= ns;
        c /= ms;
    }
    return c;
    }
}
