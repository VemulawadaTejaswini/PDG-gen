import java.util.*;

class Main{
    int[] a;
    long out;
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        a = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = Integer.parseInt(Character.toString(s.charAt(i)));
        }
        dfs(0, a[0], 0);
        System.out.println(out);
        scan.close();
    }
    
    void dfs(int i, long cn, long sum){
        int n = a.length;
        if(i == n - 1){
            out += sum + cn;
            return;
        }
        dfs(i + 1, a[i + 1], sum + cn);
        dfs(i + 1, cn * 10 + a[i + 1], sum);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
