//package D;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Solution {
    long X;
    static long MX = 100000000000007L;
    List<Long> ps, ns;

    void solve(){
        ps = new ArrayList<>(); ns = new ArrayList<>();
        ps.add(0L); ns.add(0L);
        for(long a=1; pow(a, 5) < MX; a++){
            ps.add((long)pow(a, 5));
        }
        for(long a=-1; pow(a, 5)*-1 < MX; a--){
            ns.add((long)pow(a, 5));
        }
        for(int i=0; i<ps.size(); i++){
            for(int j=i; j<ps.size(); j++){
                long ai = ps.get(i), aj = ps.get(j);
                if(aj - ai == X){
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }

        for(int i=0; i<ps.size(); i++){
            for(int j=0; j<ns.size(); j++){
                long ai = ps.get(i), aj = ns.get(j);
                if(ai - aj == X){
                    System.out.println(i + " " + j*-1);
                    return;
                }
            }
        }
    }

    public Solution() throws Exception {
        //System.setIn(new FileInputStream("d.in"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        X = sc.nextLong();
        solve();
    }

    static public void main(String[] args) throws Exception {
        Solution m = new Solution();
    }
}
