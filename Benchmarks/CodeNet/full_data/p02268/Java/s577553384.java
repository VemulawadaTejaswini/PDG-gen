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
        short[] book = new short[1000000000];
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = si(scan.readLine());
        String[] lines1 = scan.readLine().split(" ");
        for (String a: lines1) {
            book[si(a)]=1;
        }
        int Q = si(scan.readLine());
        String[] lines2 = scan.readLine().split(" ");
        for (String a: lines2) {
            book[si(a)]++;
        }
        int num = 0;
        for (short a:book) {
            if(a>=2){
                num++;
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) throws Exception{
        run(args);
    }
}