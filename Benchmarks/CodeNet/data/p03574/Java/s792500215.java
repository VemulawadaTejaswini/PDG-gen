import java.util.*;

public class Main {
    static int h;
    static int w;
    static String [] s;
    static int[] dx = { 1, 1, 0,-1,-1,-1, 0, 1};
    static int[] dy = { 0, 1, 1, 1, 0,-1,-1,-1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        s = new String [h];
        for(int i = 0; i < h; i++) {
            s[i] = sc.next();
        }
        String [] ans = solve();
        indicate(ans);
    }
    static void indicate (String [] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static String[] solve () {
        String [] ans = new String [h];
        for(int y = 0 ; y < h; y++) {
            String tmp = "";
            for(int x = 0 ; x < w; x++) {
                if(s[y].charAt(x) == '#'){
                    tmp = tmp + "#";
                } else {
                    int count = 0;
                    for(int i = 0; i < 8; i++){
                        if(judge(x,y,i)){
                            count++;
                        }
                    }
                    tmp = tmp + count;
                }
            }
            ans[y] = tmp;
        }
        return ans;
    }
    
    static boolean judge(int x, int y, int i) {
        try{
            if(s[y+dy[i]].charAt(x+dx[i]) == '#') {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}