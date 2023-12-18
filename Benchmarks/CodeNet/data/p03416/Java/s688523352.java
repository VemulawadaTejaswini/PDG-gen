import java.io.*;
import java.util.*;

class Main {
    
    static boolean go(int x) {
        String a = "" + x;
        StringBuffer sb = new StringBuffer(a);
        sb = sb.reverse();
        return a.equals(sb.toString());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = 0;
        for(int i=a; i<=b; i++) {
            if(go(i)) {
                c++;
            }
        }
        System.out.println(c);
    }
}