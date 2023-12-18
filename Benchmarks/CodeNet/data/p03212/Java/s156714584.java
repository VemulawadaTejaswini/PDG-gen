import java.util.*;

public class Main {
    static int n = 0;
    static int res = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        
        dfs(0);
        
        System.out.println(res);
    }
    
    public static void dfs(int i){
        if(i > n){
            return;
        }
        
        String str = String.valueOf(i);
        
        if(str.contains("3") && str.contains("5") && str.contains("7")){
            res++;
        }
        
        dfs(10*i+3);
        dfs(10*i+5);
        dfs(10*i+7);
    }
}
