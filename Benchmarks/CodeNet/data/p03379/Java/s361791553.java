import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] str_xs = br.readLine().split(" ");
        ArrayList<Integer> xs = new ArrayList<Integer>();
        for (int i = 0; i < str_xs.length; i++) {
            xs.add(Integer.parseInt(str_xs[i]));
        }
        ArrayList<Integer> copyxs = (ArrayList<Integer>)xs.clone();;
        for(int i = 0; i < n; i++) {
            copyxs.remove(copyxs.indexOf(xs.get(i)));
            Collections.sort(copyxs);
            System.out.println(copyxs.get((xs.size())/2 - 1));
            copyxs.add(xs.get(i));
        }
        
        
    }
}
