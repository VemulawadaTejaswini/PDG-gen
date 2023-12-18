import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();
        br.close();

        int cmn_len = N;
        String sub_s = s;
        String sub_t = t;
        
        while(!sub_s.equals(sub_t) && cmn_len > 0){
            cmn_len--;
            sub_s = s.substring(N - cmn_len, N);
            sub_t = t.substring(0, cmn_len);
        }
        System.out.println(s + t.substring(cmn_len));
    }
}