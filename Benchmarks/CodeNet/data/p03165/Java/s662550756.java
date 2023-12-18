// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    static int n;
    static int m;
    static String S;
    static String T;
    static Map<List,String> cache = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        T = sc.nextLine();
        n = S.length();
        m = T.length();
        //System.out.println(n);
        System.out.println(dfs(0,0));
        
    }
    public static String dfs(int i, int j){
        List<Integer> key = new ArrayList();
        key.add(i);
        key.add(j);
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        String res;
        if(i >= n || j >= m) return "";
        if(S.charAt(i) == T.charAt(j)){
            res = S.charAt(i) + dfs(i + 1, j + 1); 
        }else{
            String res1 = dfs(i + 1,j);
            String res2 = dfs(i, j + 1);
            if (Math.max(res1.length(),res2.length()) == res1.length()){
                res = res1;
            }else{
                res = res2;
            }
        }
        cache.put(key,res);
        return res;
        //return null;
    }
}