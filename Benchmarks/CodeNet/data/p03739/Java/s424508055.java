import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        long tmp = 0;
        long cnt = 0;
        for(int i = 0; i<n; i++) {
            tmp+=a[i];
            System.err.println(i+" "+tmp);
            if(i%2==0) {
                if(tmp<=0) {
                    cnt += 1 - tmp;
                    tmp = 1;
                }
            }else {
                if(tmp>=0) {
                    cnt += tmp + 1;
                    tmp = -1;
                }
            }
        }
        min = cnt;
        cnt = 0;
        tmp = 0;
        System.err.println(min);
        for(int i = 0; i<n; i++) {
            tmp+=a[i];
            if(i%2==1) {
                if(tmp<=0) {
                    cnt += 1 - tmp;
                    tmp = 1;
                }
            }else {
                if(tmp>=0) {
                    cnt += tmp + 1;
                    tmp = -1;
                }
            }
        }
        min = Math.min(min, cnt);
        System.out.println(min);
    }
}
