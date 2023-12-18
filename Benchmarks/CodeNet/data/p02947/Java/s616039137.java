import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> mp  = new HashMap<>(); 
        int count = 0;
        for(int i = 0 ; i < n ;i++){
            String[] data = sc.next().split("");
            Arrays.sort(data);
            String str = String.join("",data);
            if (!mp.containsKey(str)) {
                mp.put(str,1);
            }
            else{
                mp.put(str,mp.get(str)+1);
            }
            
        }
        sc.close();
        for (String key : mp.keySet()) {
            int tmp = mp.get(key);
            count += tmp*(tmp-1)/2;
        }
        System.out.println(count);
    }
}