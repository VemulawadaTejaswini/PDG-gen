import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ??\??? on 2016/12/7.
 */
public class Main {
    static int si(String s){
        return Integer.parseInt(s);
    }
    static void run(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = si(scan.readLine());
        Map<String,String> m = new HashMap<>();
        for(int t =0;t<T;t++){
            String[] lines = scan.readLine().split(" ");
            if(lines[0].equals("insert")){
                m.put(lines[1],"i");
            }
            else{
                if(m.containsKey(lines[1])){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        run(args);
    }
}