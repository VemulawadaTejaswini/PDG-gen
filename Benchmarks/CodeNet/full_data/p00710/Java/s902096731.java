import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0) break;
            int[] h = new int[n];
            for(int i=1; i<=n; i++) h[n-i]=i;
            
            while(r-- != 0) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                p -= 1;
                int[] s = new int[p];
                for(int i=0; i<p; i++) s[i] = h[i];
                for(int i=0; i<c; i++) h[i] = h[i+p];
                for(int i=0; i<p; i++) h[i+c] = s[i];
            }
            System.out.println(h[0]);
        }
    }
}

