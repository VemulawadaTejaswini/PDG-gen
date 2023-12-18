import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import javafx.util.Pair;

public class Main{
    static int[] a = new int[100005];

    public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();

        int mx = 0;
        int mn = 1<<30;
        boolean ok = true;
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            mx = Math.max(mx, a[i]);
            mn = Math.min(mn, a[i]);
        }

        if(mx == mn){
            if(mx == n-1 || 2*mx <= n) ok = true;
            else ok = false;
        }
        else if(mx == mn+1){
            int cnt1 = 0, cnt2 = 0;
            for(int i=0;i<n;i++){
                if(a[i] == mx) cnt1++;
                else cnt2++;
            }
            if(cnt2+1 <= mx && mx <= (n+cnt2)/2);
            else ok = false;
        }
        else ok = false;

        if(ok == true) System.out.println("Yes");
        else System.out.println("No");
    }

    static class InputReader{
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream){
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next(){
            while (tokenizer == null || !tokenizer.hasMoreTokens()){
                try{
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
