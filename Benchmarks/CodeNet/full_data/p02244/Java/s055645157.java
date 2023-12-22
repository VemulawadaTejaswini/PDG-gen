import java.util.*;

class Main {
    
    static int[][] queen = new int[8][8];
    static int[][] ok = new int[8][8];
    static int cnt = 0;
    
    static void mark(int a, int b, int x){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i == a || j == b || Math.abs(i - a) == Math.abs(j - b)){
                    ok[i][j] += x;
                }
            }
        }
    }
    
    static void dfs(int a){
        
        if(cnt == 8) return;
        if(a == 64) return;
        
        int i = a / 8;
        int j = a % 8;
        if(ok[i][j] == 0){
            
            mark(i, j, 1);
            queen[i][j] = 1;
            cnt++;
            dfs(a + 1);
            if(cnt == 8) return;
            
            mark(i, j, -1);
            queen[i][j] = 0;
            cnt--;
            dfs(a + 1);
            if(cnt == 8) return;
        }else{
            dfs(a + 1);
            if(cnt == 8) return;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            mark(r, c, 1);
            queen[r][c] = 1;
        }
        cnt = k;
        dfs(0);
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(queen[i][j] == 1){
                    System.out.print("Q");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
