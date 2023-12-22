import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
            int x = sc.nextInt();
            if(n + x == 0) break;
            int ans = 0;
            for(int a = 1; a <= n - 2; a++)
                for(int b = a + 1; b <= n - 1; b++)
                    for(int c = b + 1; c <= n; c++) {
                        if(a + b + c == x) ans++;
                    }
            System.out.println(ans);
        }
    }
}

