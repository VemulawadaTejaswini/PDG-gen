import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static ArrayList<Integer>[] vertice;
    static int ans = 0;
    static int total = 0;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        long cur = 1;
        int mod = (int)(1e9+7);
        for(int i=1;i<=n;i++){
            cur*=i;
            cur%=mod;
        }
        System.out.println(cur);
    }
}
