import java.util.*;
import java.io.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sr = Integer.parseInt(st.nextToken());
        int sc = Integer.parseInt(st.nextToken());
        String S = br.readLine();
        String T = br.readLine();
        int tr = sr;
        int tc = sc;
        boolean remove = false;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='L'){
                tc--;
                if(tc<=0){
                    remove = true;
                    break;
                }
            }
            if(T.charAt(i)=='R'){
                tc = Math.min(W,tc+1);
            }
        }
        tr = sr;
        tc = sc;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R'){
                tc++;
                if(tc>W){
                    remove = true;
                    break;
                }
            }
            if(T.charAt(i)=='L'){
                tc = Math.max(1,tc-1);
            }
        }
        tr = sr;
        tc = sc;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='U'){
                tr--;
                if(tr<=0){
                    remove = true;
                    break;
                }
            }
            if(T.charAt(i)=='D'){
                tr = Math.min(H,tr+1);
            }
        }
        tr = sr;
        tc = sc;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='D'){
                tr++;
                if(tr>H){
                    remove = true;
                    break;
                }
            }
            if(T.charAt(i)=='U'){
                tr = Math.max(1,tr-1);
            }
        }
        if(remove){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
