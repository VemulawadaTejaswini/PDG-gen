import java.util.*;
public class Main {
    static long gcd(long a, long b) {
        if(a<b) {
            long t = b;
            b = a;
            a = t;
        }
        if(b==0) {
            return a;
        }
        return gcd(a%b, b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        int n = sc.nextInt();
        String ans = "";
        for(int i=0;;i+=n){
            if(i>=arr.length){
                break;
            } else ans+=arr[i];
        }
        System.out.println(ans);
    }
}
