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
        for(String a : lines2){
            int l = 0;
            int r = lines1.length-1;
            int m = (l+r)/2;
            while(l<=r){
                if(si(lines1[m])==si(a)){
                    break;
                }
                else if(si(lines1[m]) < si(a)){
                    l = m+1;
                    m = (l+r)/2;
                }
                else{
                    r = m - 1;
                    m = (l+r)/2;
                }
            }
            if(l<=r){
                num++;
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) throws Exception{
        run(args);
    }
}