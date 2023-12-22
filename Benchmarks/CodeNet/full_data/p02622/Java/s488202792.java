import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String S = br.readLine();
            String T = br.readLine();
            char charS[] = S.toCharArray();
            char charT[] = T.toCharArray();
            
            int ans = 0;
            for(int i=0; i<S.length(); i++){
                if(charS[i] != charT[i]){
                    charS[i] = charT[i];
                    ans++;
                }
            }
            
            System.out.println(ans);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}