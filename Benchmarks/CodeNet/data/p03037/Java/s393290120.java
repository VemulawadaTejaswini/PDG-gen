import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] l = new int[m];
        int[] r = new int[m];
        
        for (int i = 0; i < m; i++) {
            String[] ss = br.readLine().split(" ");
            l[i] = Integer.parseInt(ss[0]);
            r[i] = Integer.parseInt(ss[1]);
        }
        
        Arrays.sort(l);
        Arrays.sort(r);

        System.out.println(r[0]-l[m-1]+1>0?r[0]-l[m-1]+1:0);
    }
}



