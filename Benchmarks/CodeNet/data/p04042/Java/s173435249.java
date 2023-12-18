import java.util.Scanner;
import java.util.ArrayList ;

/**
 *  http://arc058.contest.atcoder.jp/tasks/arc058_d
 * 
 * @author Cummin
 */
public class Main {
        static int N, K ;
        static String S[] ;
        static int Slen[] ;
        static int DP[] ;
        static ArrayList <String> DPString ;

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt() ;
        K = sc.nextInt() ;
        S = new String[N] ;
        Slen = new int[N] ;
        for (int i=0 ; i<N; i++) {
            S[i] = sc.next() ;
            Slen[i] = S[i].length() ;
        }
        DP = new int[N*10000] ; // N<1000, K<10000
        DPString = new <String> ArrayList();
        
        System.out.println(Solve(0, K)) ;
    }
    
    static String Solve(int pos, int len) {
        char zz[] = new char[2] ;
        zz[0] ='z'+1 ;
        String zzz = new String(zz) ;
        String tmp1 = new String(zz) ;
        String tmp2 = new String(zz) ;
        if (pos >= N) {
            return "" ;
        }
        if (len < 0) {
            return "" ;
        }
        if (DP[pos*10000+len]!=0) return DPString.get(DP[pos*10000+len]) ;
        for (int i=pos; i < N ; i++) {
            if (Slen[i]<len) {
                tmp2=S[i]+Solve(i+1, len - Slen[i]) ;
                if (tmp2.length() != len) tmp2=zzz ;
            } else if (Slen[i] == len) {
                tmp2=S[i] ;
            } 
            if (tmp1.compareTo(tmp2)>0) tmp1=tmp2 ;
        }
            DPString.add(tmp1) ;
            DP[pos*10000+len] = DPString.size() ;
        return tmp1 ;
    }
    
}
