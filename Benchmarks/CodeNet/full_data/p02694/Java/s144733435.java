import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        long yokin = 100;
        long ans = 0;
        while(X > yokin) {
            yokin = (long)(1.01 * yokin);
            ans++;
        }
        
        System.out.println(ans);
        
    }
}