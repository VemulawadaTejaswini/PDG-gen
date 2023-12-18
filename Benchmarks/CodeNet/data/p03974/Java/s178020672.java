import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * http://code-festival-2016-qualb.contest.atcoder.jp/tasks/codefestival_2016_qualB_e
 * 
 * @author Cummin
 */
public class Main {

    static int N ;
    static int Q ;
    static int K[] ;
    static String S[] ;
    static char S0[][] ;
    static char S1[][] ;
    static CompressedString CS[] ;
    static String P[] ;
    
    public static void main(String[] args) {
        Main t = new Main() ;
        t.doit() ;
    }
    void doit() {              
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new String[N] ;
        S0 = new char[N][] ;
        S1 = new char[N][] ;
        for (int i=0 ; i<N ;i++) {
            S[i]=sc.next() ;
            S0[i] = S[i].toCharArray() ;
            S1[i] = S[i].toCharArray() ;
            for (int j=0 ; j<S0[i].length; j++) {
                S0[i][j]=(char)(S0[i][j]-'a') ; 
                S1[i][j]=S0[i][j] ;                
            }
        }
        Q = sc.nextInt();
        K = new int[Q] ;
        P = new String[Q] ;
        for (int i=0 ; i<Q; i++) {
            K[i] = sc.nextInt() ;
            P[i] = sc.next() ;
        }
        
        for (int i=0 ; i<Q ; i++) {
            System.out.println(Solve(i)) ;
        }

    }
    
    int Solve(int n) {
        // 変換用テーブルの作成
        char P0[] = P[n].toCharArray();
        for (int j = 0; j < P0.length; j++) {
            P0[j] = (char) (P0[j] - 'a');
        }
        char P1[] = new char[26];
        for (int i= 0 ; i<26; i++) {
            if ((P1[P0[i]]) != i)  P1[P0[i]] = (char) i ;
            else P1[i] = (char) i ;
        }
        // データを変換する
        for (int i=0 ; i < N ; i++) {
            for (int j= 0 ; j < S0[i].length ;j++) {
                S1[i][j] = P1[(int)S0[i][j]] ;
//                System.out.printf("%c",S1[i][j]+'a') ;
            }
//            System.out.println() ;
        }
        // データを圧縮する
        CS= new CompressedString[N];     // 毎回、新しくする必要がある
        for (int i = 0; i < N; i++) {
            CS[i] = new CompressedString(i+1, S0[i].length/6+1) ;  // long 1つに6文字を詰め込む
            for (int j = 0; j < (S1[i].length / 6); j++) {
                for (int k = 0; k < 6; k++) {
                    CS[i].CompStr[j] = CS[i].CompStr[j] + (S1[i][j * 6 + k] << (5 * (5 - k)));
                }
                /* 
                CS[i].CompStr[j] = ((S1[i][j * 6]) << 25) + ((S1[i][j * 6 + 1]) << 20)
                                 + ((S1[i][j * 6 + 2]) << 15) + ((S1[i][j * 6 + 3]) << 10)
                                 + ((S1[i][j * 6 + 4]) << 5) + ((S1[i][j * 6 + 5])) ;
                */
            }
            if ((S1[i].length % 6) != 0) {
                int j = S1[i].length / 6;
                for (int k = 0; k < (S1[i].length % 6); k++) {
                    CS[i].CompStr[j] = CS[i].CompStr[j] + (S1[i][j * 6 + k] << (5 * (5 - k)));
                }
            } else { // do nothing
            }
        }
        // 変換 => 圧縮後のデータをソート
        Arrays.sort(CS, new CSComparator());
        // k番目のデータがソート後に何番目になったか
        for (int i=0 ; i < N ; i++) {
            if (CS[i].k==K[n]) return i+1 ;
        }
        return -1 ;
    }
    
    class CompressedString {
        int k ;
        int len ;
        long CompStr[] ;
        CompressedString(int k , int len) {
            this.CompStr = new long[len] ;
            this.k = k ;
            this.len = len ;
        }
    }
    class CSComparator implements Comparator <CompressedString> {
        public int compare (CompressedString a, CompressedString b) {
            int aa=a.CompStr.length ;
            int bb=b.CompStr.length ;
            for (int i = 0 ; i < min(aa,bb) ; i++) {
                if ((a.CompStr[i]-b.CompStr[i]) > 0) return 1 ;
                else if ((a.CompStr[i]-b.CompStr[i]) < 0) return -1 ;
            }
            if (a.len>b.len) return 1 ;
            else return -1 ;
        }
        int min(int a, int b) {
            if (a>b) return b ;
            else return a ;
        }
    }
    
    
}
