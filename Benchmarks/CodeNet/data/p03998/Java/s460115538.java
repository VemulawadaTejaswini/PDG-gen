import java.io.*;
import java.util.*;

class Main {
    static char[] a, b, c;
    static int[] ids;
    static char res;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ids = new int[3];
        a = br.readLine().toCharArray();
        b = br.readLine().toCharArray();
        c = br.readLine().toCharArray();
        recur(0, a);
        System.out.println(res);
    }
    
    static void recur(int id, char[] carr){
        if(ids[id]==carr.length){
            res = (char)(id+'A');
            return;
        }
        char curr = carr[ids[id]];
        ids[id]++;
        if(curr == 'a')
            recur(0, a);
        else if(curr == 'b')
            recur(1, b);
        else
            recur(2, c);
    }
}