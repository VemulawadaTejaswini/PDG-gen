import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        System.out.println(a+b+c+max(a, max(b, c))*(int)(Math.pow(2, k)-1));
    }  
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}