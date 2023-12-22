import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int N = Integer.parseInt(strSplit[0]);
            int K = Integer.parseInt(strSplit[1]);
            
            String strSplitFruitsPrice[] = br.readLine().split(" ");
            int fruitsPrice[] = new int[N];
            for(int i=0; i<N; i++){
                fruitsPrice[i] = Integer.parseInt(strSplitFruitsPrice[i]);
            }
            
            Arrays.sort(fruitsPrice);
            
            int ans = 0;
            
            for(int i=0; i<K; i++){
                ans = ans + fruitsPrice[i];
            }
            
            System.out.println(ans);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}