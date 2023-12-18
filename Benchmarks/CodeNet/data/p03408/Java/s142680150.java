import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    

    public static void main(String[] args) throws IOException{
        BufferedReader br  = null;
        PrintWriter writer = null;
        int havingCoin     = 0; // 所持金
        int N,M;
        String[] s, t;
        
        try {
            br     = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            N      = Integer.parseInt(br.readLine());
            s      = new String[N];
            
            for(int i = 0; i < N; i++)    s[i] = br.readLine();
            
            M      = Integer.parseInt(br.readLine());
            t      = new String[M];
            
            for(int i = 0; i < M; i ++)   t[i] = br.readLine();
            
            Arrays.sort(s);
            Arrays.sort(t);
            
            for(int i = 0; i < N; i++){
                String target = s[i];
                int firstS    = indexOf(target, s, i, N) - 1,
                    lastS     = lastIndexOf(target, s, i, N),
                    firstT    = indexOf(target, t, i, M)!= -1 ? indexOf(target, t, i, M) - 1: 0,
                    lastT     = lastIndexOf(target, t, i, M) != -1 ? lastIndexOf(target, t, i, M): 0,
                    getCoin   = (lastS - firstS) - (lastT - firstT);
                
                if(havingCoin < getCoin)    havingCoin = getCoin;
                
                i = lastS;
            }
            
            writer.println(havingCoin);
        }finally{
            if(br != null){
                br.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
    public static int indexOf(String a, String[] sansyou, int length){
        return indexOf(a, sansyou, 0, length);
    }
    
    public static int indexOf(String a, String[] sansyou, int i, int length){
        int ans = -1;
        for(int j = i ; j < length; j++){
            if(a.equals(sansyou[j])){
                ans = j;
                break;
            }
        }
        return ans;
    }
    
    public static int lastIndexOf(String a, String[] sansyou, int length){
        return lastIndexOf(a, sansyou, 0, length);
    }
    
    public static int lastIndexOf(String a, String[] sansyou, int i, int length){
        int ans = -1;
        for(int j = length - 1 ; j >= i; j--){
            if(a.equals(sansyou[j])){
                ans = j;
                break;
            }
        }
        return ans;
    }
}