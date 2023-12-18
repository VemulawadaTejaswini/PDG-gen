package abc091;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main instB;
        instB = new Main();
        Scanner sc = new Scanner(System.in);
        //N、S →青いカード
        int N = sc.nextInt();
        String[] S = new String[N];
        for( int i = 0; i<S.length; i++){
            S[i] = sc.next();
        }
        //M、T→赤いカード
        int M = sc.nextInt();
        String[] T = new String[M];
        for( int i = 0; i<T.length; i++){
            T[i] = sc.next();
        }
        int ans = 0;
        for(String word : S){
            ans = Math.max(ans, instB.money(S,T,word));
        }
        System.out.println(ans);
    }
    public int money(String[] S, String[] T, String str){
        int ans = 0;
        for(String Ss: S){
            if(str.equals(Ss)){
                ans++;
            }
        }
        for(String Ts: T){
            if(str.equals(Ts)){
                ans--;
            }
        }
        return ans;
    }
}
