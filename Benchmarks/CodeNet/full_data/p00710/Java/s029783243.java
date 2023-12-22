import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, p, c;
        while(true){
            n = sc.nextInt();
            r = sc.nextInt();
            if (n == 0 && r == 0) break;
            int remain[] = new int[n];
            int tmp[] = new int[n];
            for (int i = 0; i < n; i++) remain[i] = n - i;
            for (int i = 0; i < r; i++){
                p = sc.nextInt();
                c = sc.nextInt();
                System.arraycopy(remain,p-1, tmp,0, c);
                System.arraycopy(remain,0, remain, c, p-1);
                System.arraycopy(tmp,0, remain,0, c);
            }
            System.out.println(remain[0]);
        }
    }
}