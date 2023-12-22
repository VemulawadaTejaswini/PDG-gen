import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String str = f.readLine();
        int n = str.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '?'){
                ans.append('D');
            }else{
                ans.append(str.charAt(i));
            }
        }
        out.println(ans.toString());



        out.close();
    }
}
