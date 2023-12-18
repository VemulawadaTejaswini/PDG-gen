//package TaskC;

import java.io.FileInputStream;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    int N;
    String[] Ss;
    int ba, b, a;
    int count(String s){
        int l = s.length();
        int res = 0;
        for(int i=0; i<l -1; i++){
            if(s.charAt(i)=='A' && s.charAt(i+1)=='B'){
                res++;
            }
        }
        return res;
    }

    void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Ss = new String[N];
        ba = 0; b = 0; a = 0;
        int res = 0;
        for(int i=0; i<N; i++){
            Ss[i] = sc.next();
            res += count(Ss[i]);
            int ls = Ss[i].length();
            if(Ss[i].charAt(0)=='B' && Ss[i].charAt(ls-1)=='A') ba++;
            else if(Ss[i].charAt(0)=='B') b++;
            else if(Ss[i].charAt(ls-1)=='A') a++;
        }

        if(ba>0) res += ba - 1;
        if(a>b && ba>0) b++;
        else if(a<b && ba>0) a++;

        res += min(a, b);

        System.out.println(res);

    }

    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("inputs/c.in"));
        Main s = new Main();
        s.solve();
    }
}
