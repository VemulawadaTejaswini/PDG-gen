import java.util.*;

public class Main {
    static int n = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        
        System.out.println(dfs(0));
    }
    
    public static int dfs(int i){
        if(i > n){
            return 0;
        }
        
        int res = 0;
        
        String str = String.valueOf(i);
        
        if(str.contains("3") && str.contains("5") && str.contains("7")){
            res++;
        }
        
        res+=dfs(10*i+3);
        res+=dfs(10*i+5);
        res+=dfs(10*i+7);
        
        return res;
    }
}
