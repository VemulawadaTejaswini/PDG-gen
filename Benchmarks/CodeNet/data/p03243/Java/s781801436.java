import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        System.out.println(max(a, max(b, c))*100 + max(a, max(b, c))*10 + max(a, max(b, c)));
        
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}