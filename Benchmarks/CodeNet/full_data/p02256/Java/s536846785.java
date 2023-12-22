import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Y
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        
        System.out.println( (a>b) ? GCDivisor(a,b) : GCDivisor(b,a) );
        
    }
    
    static int GCDivisor(int x1, int x2){
        return x2 == 0 ? x1 : GCDivisor(x2, x1%x2);
    }
}