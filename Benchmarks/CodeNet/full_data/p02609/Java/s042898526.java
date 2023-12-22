import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        String x = sc.next();
    
        var a = new int[200000];
        Arrays.fill(a, 1);
        int len = a.length;
        for(int i = 0; i < len; i++){
            int b = i;
            while(b != 0){
                int p = Integer.bitCount(b);
                b = b%p;
                a[i]++;
            }
        }
    
        var pw = new PrintWriter(System.out);
        for(int i = 0; i < n; i++){
            String y = x.substring(0, i);
            if(x.charAt(i) == '0'){
                y += '1';
            }else{
                y += '0';
            }
            if(i < n-1){
                y += x.substring(i+1, n);
            }
        
            BigInteger bi = new BigInteger(y, 2);
            BigInteger p = new BigInteger(Integer.toString(bi.bitCount()));
            bi = bi.remainder(p);
            pw.println(a[Integer.parseInt(bi.toString())]);
        }
        pw.flush();
    }
}