import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        if(n % 2 == 0){
            int e = n / 2 + (n/2)%2;
            int o = n / 2 - (n/2)%2 - 1;
            int r = e;
            for (int i = 1; i <= e/2; i++) {
                sb.append(i + " " + r + "\n");
                cnt++;
                r--;
                if(m <= cnt) break;
            }
            int l = e+1;
            r = n-1;
            for (int i = 1; i <= o/2; i++) {
                if(m <= cnt) break;
                sb.append(l + " " + r + "\n");
                cnt++;
                l++; r--;
            }
        }else{
            int l = 1;
            int r = n-1;
            while(cnt < m){
                sb.append(l + " " + r + "\n");
                l++; r--;
                cnt++;
            }
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
