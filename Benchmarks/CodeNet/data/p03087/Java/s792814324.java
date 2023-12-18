Loading subst-jis...done
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();
        int[] a = new int[N];
        char pre = s.charAt(0);
        for(int i = 1; i<N; i++) {
            if(pre=='A' && s.charAt(i)=='C') a[i] = a[i-1] + 1;
            else a[i] = a[i-1];
            pre	= s.charAt(i);
        }
        for(int i = 0; i<Q; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(a[end-1]-a[start-1]);
        }
    }
}
