import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
		    ans += calcComb(entry.getValue());
		}
        System.out.println(ans);
    }

    static long calcComb(int n){
        long ret = (long)n;
        return ((ret*ret)-ret)/2;
    }
}

