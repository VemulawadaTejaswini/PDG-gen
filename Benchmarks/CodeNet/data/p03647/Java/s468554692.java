import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        HashSet<Integer>[] via=new HashSet[n+1];
        for (int i = 1; i <= n; i++) {
            via[i]=new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            via[a[i]].add(b[i]);
            via[b[i]].add(a[i]);
        }
        for (Integer k:via[1]){
            for (Integer l:via[k]){
                if(l==n){
                    out.println("POSSIBLE");
                    exit(0);
                }
            }
        }
        out.println("IMPOSSIBLE");
    }
}