import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        int l[] = new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
            ret += l[i];
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(ret-l[p-1]+x);
        }
    }
}