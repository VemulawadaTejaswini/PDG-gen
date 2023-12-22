import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sa = br.readLine().split(" ");
        String[] array = br.readLine().split(" ");
        List<Integer> list = new ArrayList();
        
        int n = Integer.parseInt(sa[0]);
        int k = Integer.parseInt(sa[1]);
        
        Arrays.sort(array);
        
        int ans = 0;
        
        for(int i=0;i<k;i++) {
            ans+=Integer.parseInt(array[i]);
        }
        
        System.out.println(ans);
    }
}