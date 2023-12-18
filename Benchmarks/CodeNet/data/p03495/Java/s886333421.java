import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        
        
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(line[i]);
            if (nums.get(key) == null) nums.put(key, 1);
            else nums.put(key, nums.get(key) + 1);
        }
        
        
        List<Integer> list = new ArrayList<>(nums.values());
        Collections.sort(list);
        
        int res = 0;
        for (int i = 0; i < list.size() - k; i++) {
            res += list.get(i);
        }
        
        System.out.println(res);
    }
}
