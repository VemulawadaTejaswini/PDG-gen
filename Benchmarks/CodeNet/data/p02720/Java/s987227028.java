import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static List<Long> list;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        list = new ArrayList<>();
        
        for(int i = 1; i <= 9; i++){
            dfs(Integer.toString(i));
        }
        
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
    
    static void dfs(String s){
        
        list.add(Long.parseLong(s));
        
        if(s.length() == 10) return;
        
        int a = Integer.parseInt(s.substring(s.length()-1, s.length()));
        if(1 <= a) dfs(s + (a-1));
        dfs(s + a);
        if(a <= 8) dfs(s + (a+1));
    }
}