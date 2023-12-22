import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(
         System.in));
         String arrStr = reader.readLine();
         StringTokenizer tokenizer = new StringTokenizer(arrStr, " ");

         int a = Integer.parseInt(tokenizer.nextToken());
         int b = Integer.parseInt(tokenizer.nextToken());

        System.out.println(gcd(a, b));
//        System.out.println(gcd(54, 20));
    }

    static int gcd(int m, int n) {
        
        int r;
        while((r = m % n) != 0){
            m = n;
            n = r;
        }
        return n;
    }

}