import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        long lcm=(long)n/(long)gcd(n,m)*(long)m;
        HashMap<Long,Character> mapS=new HashMap<>();
        HashMap<Long,Character> mapT=new HashMap<>();
        long tempn=lcm/n;
        int k=0;
        for (long i = 0; i < n; i++) {
            mapS.put(i*tempn+1l,s.charAt(k));
            ++k;
        }
        long tempm=lcm/m;
        k=0;
        for (long i = 0; i < m; i++) {
            mapT.put(i*tempm+1l,t.charAt(k));
            ++k;
        }
        for (long i:mapS.keySet()) {
            if(mapS.get(i)!=null&&mapT.get(i)!=null&&mapS.get(i)!=mapT.get(i)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}