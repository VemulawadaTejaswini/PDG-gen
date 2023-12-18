import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int ans = 0;
        if(a+b <= c*2) {
            ans = a*x + b*y;
        }else {
            if(a*2 <= c*4 && b*2 <= c*4) { 
                if(x >= y) ans = c*2*y + a*(x-y);
                else ans = c*2*x + b*(y-x);
            }else if(a*2 >= c*4 && b*2 <= c*4) {
                if(x >= y) ans = c*2*x;
                else ans = c*2*x + b*(y-x);
            }else if(a*2 <= c*4 && b*2 >= c*4) {
                if(y >= x) ans = c*2*y;
                else ans = c*2*y + b*(x-y);
            }else {
                ans = c*2*max(x,y);
            }
        }
        System.out.println(ans);
    }
    
    static int max(int x, int y) {
        if(x >= y) return x;
        else return y;
    }
    
    static int min(int x, int y) {
        if(x >= y) return y;
        else return x;
    }
}
