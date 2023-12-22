import java.util.*;

public class Main {
    static int gcd (int x,int y) {return y>0?gcd(y,x%y):x;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        if(A==B) {
            System.out.println("YES");
            return;
        }
        if(V<=W) {
            System.out.println("NO");
            return;
        }
        long dist = Math.abs(A-B);
        long diff = V-W;
        if(diff * T >= dist) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
