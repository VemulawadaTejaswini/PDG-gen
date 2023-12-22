import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var X = scanner.nextInt();
        var N = scanner.nextInt();

        var ps = new int[N];
        for(int i=0; i<ps.length; i++)
            ps[i] = scanner.nextInt();

        Arrays.sort(ps);
        if(isContain(ps, X)) {
            System.out.println(X); return;
        }

        var ans = X;
        for(int i=1; ; i++) {
            ans = X-i;
            if(isContain(ps, ans))
                break;
            ans = X+i;
            if(isContain(ps, ans))
                break;
        }

        System.out.println(ans);
    }
    
    static boolean isContain(int[] array, int key) {
        return Arrays.binarySearch(array, key) < 0;
    }
}