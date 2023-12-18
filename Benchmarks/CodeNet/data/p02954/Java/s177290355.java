import java.util.*;
import java.lang.*;

class MathLib{
    public static long divCeil(long a, long b){
        return (a+b-1)/a;
    }

    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

    public static LinkedList<Long> divisors(long N){
        LinkedList<Long> ans = new LinkedList<>();
        for(long n = (long)(Math.sqrt(N)+2); n>0; n--){
            if(n*n>N) continue;
            else if(n*n==N) ans.add(n);
            else if(N%n==0){
                ans.addFirst(n);
                ans.addLast(N/n);
            }
        }
        return ans;
    }
}
public class Main {
    static void printArray(int[] array){
        for(int i=0; i<array.length-1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[array.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        TreeSet<Integer> gather = new TreeSet<>();
        for(int n=0; n<N-1; n++){
            if(S.charAt(n)=='R' && S.charAt(n+1)=='L') gather.add(n);
        }

        int[] ans = new int[N];
        for(int n=0; n<N; n++){
            int g = (S.charAt(n)=='R') ? gather.tailSet(n).first() : gather.headSet(n).last();
            if(n%2 == g%2) ans[g]++;
            else ans[g+1]++;
        }
       printArray(ans);
    }
}
