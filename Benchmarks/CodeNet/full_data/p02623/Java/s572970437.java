import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        long k;
        n = sc.nextInt(); m = sc.nextInt(); k = sc.nextLong();
        sc.nextLine();
        int i;
        long N[] = new long[n];
        long M[] = new long[m];
        for(i = 0; i < n; i++) N[i] = sc.nextLong();
        sc.nextLine();
        for(i = 0; i < m; i++) M[i] = sc.nextLong();
        sc.nextLine();
        
        long limit = 0;
        int ntop = 0, mtop = 0;
        while(limit < k){
            
            if(N[ntop] > M[mtop] || mtop >= m){
                if((limit + M[mtop]) < k) limit += M[mtop++];
                else break;
            }else{
                if((limit + N[ntop]) < k) limit += N[ntop++];
                else break;
            }

        }

        System.out.println(mtop+ntop);

    }
}