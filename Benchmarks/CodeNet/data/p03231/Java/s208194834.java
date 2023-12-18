import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        sc.close();

        int L = (N*M)/gcd(N, M);

        int[] c = new int[L];

        for(int i = 0; i < N; i++){
            c[i*(L/N)] += (int)(S.charAt(i) - 'a' + 1);
        }

        for(int i = 0; i < M; i++){
            int t = (int)(T.charAt(i) - 'a' + 1);
            if( c[i*(L/M)] == 0)
                continue;
            else {
                if( c[i*(L/M)] == t)
                    continue;
                else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(L);
    }

    static int gcd(int n, int m){
        if(n < m)
            return gcd(m, n);
        else{
            if(m == 0)
                return n;
            else
                return gcd(m, n%m);
        }
    }
}