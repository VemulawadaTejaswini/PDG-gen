import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h;
        for(int i = 0; i < n; i++) {
            h = Integer.parseInt(sc.next());
            if(h >= k) ans++;
        }
        System.out.println(ans);
    }
}
