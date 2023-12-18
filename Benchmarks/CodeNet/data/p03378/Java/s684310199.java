import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] a = new int[n+1];

        for(int i=0; i<m; i++) {
            a[Integer.parseInt(sc.next())]++;
        }
        int ton = 0;
        int to0 = 0;
        for(int i=x+1; i<=n; i++) {
            if(a[i] != 0) ton++;  
        }
        for(int i=x-1; i>=0; i--) {
            if(a[i] != 0) to0++;  
        }
        System.out.println(min(ton, to0));
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
}
