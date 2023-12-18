
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jaga on 9/6/16.
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long n,s;
        n = Long.parseLong(line);
        line = br.readLine();
        s = Long.parseLong(line);


//        for(int i = 2; i < n; i++){
//            System.out.println("b : " + i + " -> " + func(i, n));
//        }

        long ans = -1;
        for(int i = 2; i < n ; i++){
            if(func(i,n) == s){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    static long func(long b, long n){
        if(n < b){
            return n;
        }else{
            return func(b, n/b) + n%b;
        }
    }
}

