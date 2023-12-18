import java.util.*;

public class Main{
    static final int INF = (int)1e9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();
        long k = Integer.parseInt(sc.next());
        
        int n = s.length;
        
        long gcnt = 0;
        long scnt = 0;
        long cnt = 0;
        if(s[0] == s[n-1]){
            //後ろと前がつながる
            for(int i=n-1; i>=0; i--){
                if(s[i]==s[0]){
                    gcnt++;
                }else{
                    break;
                }
            }
            for(int i=0; i<n; i++){
                if(s[i]==s[0]){
                    scnt++;
                }else{
                    break;
                }
            }
        }
        
        if(scnt == n){
            //一種類なら
            System.out.println( n*k/2 );
        }else{
            int ren = 0;
            for(int i=0; i<n-1; i++){
                if(s[i] == s[i+1]){
                    ren++;
                    if(ren%2==1){
                        cnt++;
                    }
                }else{
                    ren = 0;
                }
            }
            
            long ans = cnt*k;
            if(k != 1){
                ans += (gcnt+scnt)/2*(k-1)-(gcnt/2+scnt/2);
            }
            System.out.println(ans);
        }
        
    }
}
