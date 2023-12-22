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
        var ans = X;
        if(Arrays.binarySearch(ps, ans) == -1) {
            System.out.println(ans); return;
        }

        for(int i=1; ; i++) {
            ans = X-i;
            if(Arrays.binarySearch(ps, ans) == -1)
                break;
            ans = X+i;
            if(Arrays.binarySearch(ps, ans) == -1)
                break;
        }

        System.out.println(ans);
    }
}