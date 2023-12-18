import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static ArrayList<Long> ans = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        for(int i = 0; i < 10; i++){
            ArrayList<Integer> tmp = new ArrayList<>();
            if(i - 1 >= 0) tmp.add(i-1);
            tmp.add(i);
            if(i + 1 < 10) tmp.add(i+1);
            adj.add(tmp);
        }
        for(int i = 1; i < 10; i++){
            String s = String.valueOf(i);
            dfs(s);
        }
        Collections.sort(ans);
        //System.out.println(ans);
        System.out.println(ans.get(k-1));
    }
    
    public static void dfs(String s){
        ans.add(Long.valueOf(s));
        if(s.length() == 10) return;
        int ind = Character.getNumericValue(s.charAt(s.length()-1));
        for(int i : adj.get(ind)){
            dfs(s+i);
        }
        return;
    }
}