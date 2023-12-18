import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    HashSet<Integer> cycle;
    int[] prev;
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<10) return n;
        long ans = 9;
        for(int i=10;i<=n;i++){
            ans += singleNumber(i);
        }
        return ans;
    }
    long singleNumber(int x){
        // num of pairs that with one value being x
        if(x%10==0) return 0;
        String s = Integer.toString(x);
        int len = s.length();
        int head = s.charAt(0)-'0', tail = s.charAt(len-1)-'0';
        // it's guaranteed that tail != 0
        long ans = 0;
        if(head==tail) ans += 1; // for size = 1 case. E.g. 22->2
        int size = 2;
        while(size<=len){
            if(size<len){
                ans += power(10,size-2);
            } else{
                // size == len. needs careful
                if(tail>head) ans += 0;
                else if(tail < head){
                    ans += power(10,size-2);
                } else{
                    // head == tail
                    String mid = s.substring(1,len-1);
                    if(mid.length()==0) ans += 1;
                    else ans += 1+Integer.parseInt(mid);
                }
            }
            size += 1;
        }
        ans *= 2; // change order
        // finally check repeat
        if(head==tail) ans -= 1;
        return ans;
    }
    int power(int base, int q){ // no bigger than 1e6
        int ans = 1;
        while(q>0){
            if(q%2==1) ans *= base;
            base *= base;
            q /= 2;
        }
        return ans;
    }
}

