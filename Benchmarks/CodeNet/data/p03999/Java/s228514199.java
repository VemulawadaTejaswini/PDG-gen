import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String s = br.readLine();
        dfs(0,0,s);
        System.out.println(ans);
    }   

    public static void dfs(long sum, int idx, String s){
        if(idx==s.length()){
            ans+=sum;
            return;
        }
        for(int i=idx+1; i<=s.length(); i++){
            dfs(sum+Long.parseLong(s.substring(idx,i)), i, s);
        }
        return;

    }


    // public static long recurse(String s){
    //     if(s.length()==0)
    //         return 0;
    //     long ans=0;
    //     for(int i=1; i<=s.length(); i++){
    //         long cur = Long.parseLong(s.substring(0,i));
    //         cur+=cur*(Math.max(s.length()-i-1,0));
    //         cur+=recurse(s.substring(i,s.length()));;
    //         ans += cur;
    //     }
    //     return ans;    
    // }

}
