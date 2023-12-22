import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char[] c = new char[n];
        for(int i = 0; i < n; i++) c[i] = s.charAt(i);
        int out1 = 0;
        int cw = 0;
        for(int i = 0; i < n; i++){
            if(c[i] == 'W') cw++;
        }
        out1 = Math.min(cw, n - cw);
        int out2 = 0;
        int w = 0;
        for(int i = 0; i < n - 1; i++){
            if(c[i] == 'W' && c[i + 1] == 'W') w++;
            else{
                int r = 0;
                for(int j = n - 1; j >= i; j--){
                    if(c[j] == 'R'){
                        r++;
                        c[j] ='W';
                    }
                    if(r >= w) break;
                }
                out2 += r;
            }
        }
        System.out.println(Math.min(out1, out2));
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
