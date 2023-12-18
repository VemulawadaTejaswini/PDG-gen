import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) b[i] = scan.nextInt();
        Integer[] c = new Integer[n];
        for(int i = 0; i < n; i++) c[i] = scan.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long out = 0;
        for(int i = 0; i < n; i++){
            long ca = ~Arrays.binarySearch(a, b[i], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
            long cc = n - ~Arrays.binarySearch(c, b[i], (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
            out += ca * cc;
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
