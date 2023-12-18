import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        if(sa(a,c) <= d || sa(a,b) <= d && sa(b,c) <= d) System.out.println("Yes");
        else System.out.println("No");
    }
    
    static int sa(int a, int c) {
        if(a <= c) {
            return c-a;
        }else {
            return a-c;
        }
    }
}