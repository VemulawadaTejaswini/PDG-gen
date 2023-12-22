import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws Exception {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s = br.readLine().split(" ");
        br.readLine();
        String[] t = br.readLine().split(" ");
         
        int cnt = 0;
        for(String p : t)
            if(Arrays.binarySearch(s, p) >= 0) ++cnt;
        
        System.out.println(cnt);
    }
}
