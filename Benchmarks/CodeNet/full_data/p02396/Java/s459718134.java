import java.util.*;
import java.io.*;
 
class Prg {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t;
        String ans = "";
        for(long i = 1;; i++){
            t = reader.readLine();
            if(t.equals("0")) break;
            ans += "Case " + i + ": " + Integer.parseInt(t) + "\n";
        }
        System.out.println(ans);
    }
}