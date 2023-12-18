import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        String s=sc.next();
        String t=sc.next();
        long lcm=n/gcd(n,m)*m;
        HashMap<Integer,Character> mapS=new HashMap<>();
        HashMap<Integer,Character> mapT=new HashMap<>();
        for (long i = 0; i < n; i++) {
            mapS.put((int)(i*lcm/n+1),s.charAt((int)i));
        }
        for (long i = 0; i < m; i++) {
            mapT.put((int)(i*lcm/m+1),t.charAt((int)i));
        }
        for (long i = 1; i <= lcm; i++) {
            if(mapS.get((int)i)!=null&&mapT.get((int)i)!=null&&mapS.get((int)i)!=mapT.get((int)i)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}