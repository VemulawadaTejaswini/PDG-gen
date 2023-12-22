import java.util.Scanner;

public class Main {
    public static void sreach(int aim, int nofA, int A[]) {
        int bin[] = new int[nofA];
        int n = 0;
        int x = 0;
        int maxX = 1;
        int ans = 0;
        for (int i = 0; i < nofA; i++) {
            maxX = maxX * 2;
        }
        maxX--;
        for (int xvalue = maxX; xvalue >= 0; xvalue--) {
            x = xvalue;
            while (x >= 2) {
                bin[n] = x % 2;
                n++;
                x = x / 2;
            }
            bin[n] = x;
            for (int i = n + 1; i < nofA; i++) {
                bin[i] = 0;
            }
            for (int i =  nofA-1; i>=0; i--) {
                if (bin[i] == 1)
                    ans = ans + A[i];
            }
            if (ans == aim) {
                System.out.println("yes");
                break;
            }
            if(x == 0)System.out.println("no");
            n = 0;
            ans =0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1, q = 1;
        n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        q = scan.nextInt();
        int m[] = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < q; i++) {
            sreach(m[i], n, a);
        }
    }
}
