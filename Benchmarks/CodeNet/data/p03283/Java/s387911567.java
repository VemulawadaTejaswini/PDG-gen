import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int Q = sc.nextInt();
        int l[] = new int[m];
        int r[] = new int[m];
        int p[] = new int[Q];
        int q[] = new int[Q];
        for(int i = 0; i < m; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for(int i = 0; i < Q; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        for(int i = 0; i < Q; i++){
            int a = 0;
            for(int k = 0; k < m; k++){
                if (l[k] < p[i]) {
                }else if (r[k] > q[i]) {
                }else{
                    a++;
                }
            }
            System.out.println(a);
        }
    }
}