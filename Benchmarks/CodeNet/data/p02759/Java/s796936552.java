import java.util.*;
public class Main {
    public static int max(int a, int b){return (a > b ? a : b);}
    public static int min(int a, int b){return (a < b ? a : b);}
    public static int gcd(int a, int b){return (b > 0 ? gcd(b, a % b) : a);}
    public static int lcm(int a, int b){return a / gcd(a, b) * b;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int ans = N / 2 + N % 2;
        System.out.print(ans);
    }
}
