//package TaskD;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Math.*;

public class Main {
    long N;

    void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        long res = 0;
        Set<Long> st = new HashSet<>();
        for(long a=1; a<=sqrt(N); a++){
            if(N % a == 0){
                long b = N/a;

                if(a>1 && !st.contains(a-1)){
                    //res += a - 1;
                    st.add(a-1);
                }

                if(b>1 && !st.contains(b-1)){
                    //res += b - 1;
                    st.add(b-1);
                }
            }
        }
        for(long a : st){
            if(N/a == N%a){
                res+=a;
            }
        }
        //System.out.println(st);
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("inputs/d.in"));
        Main s = new Main();
        s.solve();
    }
}
