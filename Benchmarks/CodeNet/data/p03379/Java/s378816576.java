import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] str_xs = br.readLine().split(" ");
        ArrayList<Integer> xs = new ArrayList<Integer>();
        //int[] xs = new int[str_xs.length+1];
        //xs[0] = 0;
        for (int i = 0; i < str_xs.length; i++) {
            xs.add(Integer.parseInt(str_xs[i]));
            //xs[i+1] = Integer.parseInt(str_xs[i]);
        }
        //int copy;
        ArrayList<Integer> copyxs;
        //Arrays.sort(xs);
        for(int i = 0; i < n; i++) {
            //02344
            /*if (i <= n/2) {
                ans = xs[n/2+1];
            }
            else {
                ans = xs[n/2];
            }*/
            copyxs = (ArrayList<Integer>)xs.clone();
            copyxs.remove(i);
            Collections.sort(copyxs);
            System.out.println(copyxs.get((xs.size())/2 - 1));
            //System.out.println(ans);
        }
        
        
    }
}
