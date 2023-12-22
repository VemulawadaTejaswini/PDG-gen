import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        long[] a = new long[n];
        long[] b = new long[m];
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        for(int i=0; i<m; i++) {
            b[i] = Long.parseLong(sc.next());
        }
        
        long t = 0;
        int i=0;
        int j=0;
        long count1 = 0;
        while(t <= k) {
            if(i < n && j < m) {
                if(a[i] < b[j]) {
                    t += a[i];
                    i++;
                }else {
                    t += b[j];
                    j++;
                }
            }else if(i < n) {
                t += a[i];
                i++;
            }else if(j < m) {
                t += b[j];
                j++;
            }else {
                break;
            }
            count1++;
        }
        
        if(t > k) {
            count1--;
        }
        
        t=0;
        i=0;
        j=0;
        long count2 = 0;
        while(t <= k && i < n) {
            t += a[i];
            count2++;
            i++;
        }
        if(t <= k) {
            while(t <= k && j < m) {
                t += b[j];
                count2++;
                j++;
            }
        }
        if(t > k) {
            count2--;
        }
        
        t=0;
        i=0;
        j=0;
        long count3 = 0;
        while(t <= k && j < m) {
            t += b[j];
            count3++;
            j++;
        }
        if(t <= k) {
            while(t <= k && i < n) {
                t += a[i];
                count3++;
                i++;
            }
        }
        if(t > k) {
            count3--;
        }
        
        System.out.println(Math.max(count1, Math.max(count2, count3)));
    }
}
