
import java.io.IOException;
import java.io.BufferedReader;
 
class Prg {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = -1;
        String ans = "";
        for(int i = 1;t != 0; i++){
            t =  Integer.parseInt(reader.readLine());
            if(t == 0) {}
            else System.out.println("Case " + i + ": " + t);
        }
    }
}