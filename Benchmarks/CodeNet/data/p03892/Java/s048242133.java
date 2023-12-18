import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (A==C || B==D) { System.out.println(0); return; }

        int y = Math.abs(D-B);
        int x = Math.abs(C-A);
        long ans = y/x;
        if (y % x != 0) { ans++; }
        ans *= x;
        System.out.println(ans);
    }
}
