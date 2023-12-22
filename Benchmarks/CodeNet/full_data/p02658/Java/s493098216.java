import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(System.in);
        BigInteger LIMIT = new BigInteger("1000000000000000000");
        BigInteger prod = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        int n = in.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        boolean z = false;
        while(token.hasMoreTokens()){
            BigInteger bg = new BigInteger(token.nextToken());
            if(bg.compareTo(zero) == 0) {
                z = true;
                break;
            }
            prod = prod.multiply(bg);
        }
        if(z) System.out.println(0);
        else if(prod.compareTo(LIMIT) == 1) System.out.println(-1);
        else System.out.println(prod);
    }
}


