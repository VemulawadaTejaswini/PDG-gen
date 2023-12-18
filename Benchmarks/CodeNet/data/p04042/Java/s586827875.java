import java.io.*;
import java.util.ArrayList ;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        static char zz[] = new char[2] ;
        static String zzz ;

        public static void main(String[] args) {
        String line ;
        line = getOneLine() ; 
        S = line.split(" ") ;
        N=Integer.valueOf(S[0]) ;
        K=Integer.valueOf(S[1]) ;
        S = new String[N] ;
        Slen = new int[N] ;
        
        for (int i=0 ; i<N; i++) {
            S[i]=getOneLine() ;
            Slen[i] = S[i].length() ;
        }
        DP = new int[N*10000] ; // N<1000, K<10000
        DPString = new <String> ArrayList();
        zz[0] ='z'+1 ;
        zzz = new String(zz) ;
        
        System.out.println(Solve(0, K)) ;
    }
    
    static String Solve(int pos, int len) {
        String tmp1 = zzz ;
        String tmp2 = zzz ;
        if (pos >= N) {
            return "" ;
        }
        if (len < 0) {
            return "" ;
        }
        if (DP[pos*10000+len-1]!=0) return DPString.get(DP[pos*10000+len-1]) ;
        for (int i=pos; i < N ; i++) {
            if (Slen[i]<len) {
                tmp2=S[i]+Solve(i+1, len - Slen[i]) ;
                if (tmp2.length() != len) tmp2=zzz ;
            } else if (Slen[i] == len) {
                tmp2=S[i] ;
            } 
            if (tmp1.compareTo(tmp2)>0) tmp1=tmp2 ;
        }
            if (tmp1.equals(zzz)) tmp1="" ;
            DPString.add(tmp1) ;
            DP[pos*10000+len-1] = DPString.size()-1 ;
        return tmp1 ;
    }

    static String getOneLine() {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ;
        String line = "" ;
            try {
                line = br.readLine();
            } catch (IOException ex) {
                 ex.printStackTrace();
            }
        return line.trim() ;        
    }    
    
}
