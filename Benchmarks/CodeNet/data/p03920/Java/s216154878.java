import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long ok = n;
        long ng = 0;
        while(1 < ok - ng){
            long mid = (ok + ng) /2;
            if(n <= mid * (mid + 1) / 2) ok = mid;
            else ng = mid;
        }
        long diff = ok * (ok + 1) / 2 - n;
        StringBuilder sb = new StringBuilder();
        for (long i = 1; i <= ok; i++) {
            if(i != diff) sb.append(i).append("\n");
            if(i % 1000 == 0){
                System.out.print(sb.toString());
                sb = new StringBuilder();
            }
        }
        if(0 < sb.length()) System.out.print(sb.toString());
        sc.close();
    }

}
