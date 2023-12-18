import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int K = s.nextInt();
        String S = s.next();
        
        String a = S.substring(0, K - 1);
        String b = S.substring(K - 1, K);
        String c = S.substring(K, N);
        
        String res = a + b.toLowerCase() + c;
        
        System.out.println(res);


    }
}
