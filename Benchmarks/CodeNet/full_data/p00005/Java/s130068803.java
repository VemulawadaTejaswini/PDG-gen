import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]) {
        int a, b, gcd, lcm;
        String line;
        String number[];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while((line = reader.readLine()) != null){
                number = line.split(" ");
                a = Integer.parseInt(number[0]);
                b = Integer.parseInt(number[1]);
                if(a > b) gcd = GCD(a, b);
                else gcd = GCD(b, a);
                lcm = a*b/gcd;
                System.out.println(gcd + " " + lcm);
            }
        }catch(IOException e){
            System.exit(0);
        }
    }

    static int GCD(int a, int b){
        int tmp;
        if(a%b != 0){
            tmp = GCD(b, a%b);
        }else return b;
        return tmp;
    }
}