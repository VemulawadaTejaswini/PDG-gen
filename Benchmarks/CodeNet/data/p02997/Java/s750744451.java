import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = (n-1)*(n-2)/2;
        if((n-1)*(n-2)/2 < k) System.out.println(-1);
        else{
            int m = (n-1) + (max - k);
            StringBuilder sb = new StringBuilder();
            int t = 0;
            for (int i = 2; i <= n; i++) {
                sb.append("1 " + i + "\n");
                t++;
            }
            boolean end = false;
            int l = 2;
            int r = 3;
            while(t < m){
                while(t < m && r <= n){
                    sb.append(l + " " + r + "\n");
                    t++;
                    r++;
                }
                l++;
            }
            System.out.println(m);
            System.out.print(sb.toString());
        }
        sc.close();

    }

}
