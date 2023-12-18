import java.util.*;

public class Main {
    
    static int ans;
    static int N;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dfs(0L, 0b000);
        System.out.println(ans);
    }
    
    static void dfs( long num, int use ){
        
        if( num > N ){
            return;
        }
        
        if( use == 0b111 ){
            ans++;
        }
        
        dfs( num * 10 + 3, use | 0b001 );
        dfs( num * 10 + 5, use | 0b010 );
        dfs( num * 10 + 7, use | 0b100 );
        
    }
}
