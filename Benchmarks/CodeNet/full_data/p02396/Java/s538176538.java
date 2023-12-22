import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Prg {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = "";
        String ans = "";
        for(int i = 1;!t.equals("0"); i++){
            t =  reader.readLine();
            if(!t.equals("0")) System.out.println("Case " + i + ": " + t);
        }
    }
}