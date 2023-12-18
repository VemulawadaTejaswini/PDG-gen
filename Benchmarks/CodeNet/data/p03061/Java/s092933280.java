import java.util.*;
public class Main {
    public static int max(int a, int b){return (a > b ? a : b);}
    public static int min(int a, int b){return (a < b ? a : b);}
    public static int gcd(int a, int b){return (b > 0 ? gcd(b, a % b) : a);}
    public static int lcm(int a, int b){return a / gcd(a, b) * b;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N + 1];
        int L[] = new int[N + 1];
        int R[] = new int[N + 1];
        for(int i = 1; i <= N; i++){
            A[i] = sc.nextInt();
        }
        L[1] = A[1];
        for(int i = 2; i <= N; i++)L[i] = gcd(L[i - 1], A[i]);
        R[N] = A[N];
        for(int i = N - 1; i >= 1; i--)R[i] = gcd(R[i + 1], A[i]);
        // for(int i = 1; i <= N; i++)System.out.print(L[i] + (i == N ? "\n" : " "));
        // for(int i = 1; i <= N; i++)System.out.print(R[i] + (i == N ? "\n" : " "));
        int ans = max(L[N - 1], R[2]);
        for(int i = 2; i < N; i++)ans = max(ans, gcd(L[i - 1], R[i + 1]));
        System.out.println(ans);
    }
}
