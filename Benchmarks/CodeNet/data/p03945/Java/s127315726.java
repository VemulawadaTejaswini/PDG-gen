import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String s = (br.readLine());
        System.out.println(solver(s));
        
    }
    public static int solver(String s){
        if(s.length()==1)
            return 1;
        int ans=0;
        char cur = s.charAt(0);
        for (int i=1; i<s.length(); i++) {
            if(s.charAt(i)!=cur){
                ans++;
                cur=s.charAt(i);
            }
        }
        return ans;
    }
}
