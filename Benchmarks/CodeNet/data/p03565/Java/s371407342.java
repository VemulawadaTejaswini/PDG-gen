import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        char[] ans = new char[s.length];
        boolean poyo = false;
        for(int i = 0;i <= s.length-t.length;i++){
            for(int j = 0;j < t.length;j++){
                if(s[i+j]==t[j]||s[i+j]=='?'){
                    poyo = true;
                }else{
                    poyo = false;
                    break;
                }
            }
            if(poyo){
                for(int k = 0;k < i;k++){
                    if(s[k]=='?')s[k]='a';
                }
                for(int k = i;k < s.length;k++){
                    if(s[k]=='?')s[k]=t[k-i];
                }
            }
        }
        if(poyo){
            System.out.println(s);
        }else{
            System.out.println("UNRESTORABLE");
        }

    }       
}




