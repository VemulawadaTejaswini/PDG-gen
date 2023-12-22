import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        String[] lines1 = scan.readLine().split(" ");
        int Q = si(scan.readLine());
        String[] lines2 = scan.readLine().split(" ");
        int num = 0;
        for(String s : lines2){
            for(String ss : lines1){
                if(si(s)==si(ss)){
                    num++;
                    break;
                }
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) throws Exception{
        run(args);
    }
}