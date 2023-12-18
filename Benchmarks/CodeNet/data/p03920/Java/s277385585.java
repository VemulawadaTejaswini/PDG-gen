import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ok = n;
        int ng = 0;
        while(1 < ok - ng){
            int mid = (ok + ng) /2;
            if(n <= mid * (mid + 1) / 2) ok = mid;
            else ng = mid;
        }
        int diff = ok * (ok + 1) / 2 - n;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= ok; i++) if(i != diff) sb.append(i).append("\n");
        System.out.println(sb.toString());
        sc.close();
    }

}
