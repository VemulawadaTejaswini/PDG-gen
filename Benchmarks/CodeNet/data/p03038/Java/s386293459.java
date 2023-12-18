import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[m];
        int min = 100001;
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
        }
        Arrays.sort(a);
        for(int i=0; i<m; i++) {
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            int count = b[i];
            if(a[0] < c[i]) {
                for(int j=0; j<n; j++) {
                    if(count == 0) break;
                    if(a[j] < c[i]) {
                        sum -= a[j];
                        a[j] = c[i];
                        sum += c[i];
                        count--;
                    }else break;
                }
                Arrays.sort(a);
            }else break;
        }
        System.out.println(sum);
    }
}