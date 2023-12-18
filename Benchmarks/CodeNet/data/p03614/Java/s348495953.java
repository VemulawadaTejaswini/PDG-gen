import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c;
        int ans = 0;
        for (int i=0; i<n-1; i+=2) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (i == n-3) {
                c = sc.nextInt();
                if (a != i+1 && b != i+2 && c != i+3) {
                    ans=ans;
                } else if (a == i+1 && c == i+3) {
                    ans += 2;
                } else {
                    ans++;
                }
            } else {
                if (a == i+1 || b == i+2) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}