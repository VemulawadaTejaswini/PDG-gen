import java.util.Scanner;
import java.io.BufferedInputStream;
import java.lang.Math;
import java.util.*;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int N = sc.nextInt();
        int r0 = 0;
        int r2 = 0;
        int r4 = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(x % 4 == 0) {
                r4++;
            } else if (x % 2 == 0) {
                r2++;
            } else {
                r0++;
            }
        }
        if(ok(N,r0,r2,r4)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean ok(int n,int r0,int r2,int r4) {
        if(r0 > r4 + 1) return false;
        if(r0 == r4 + 1) return (r2 == 0);
        return true;
    }
}
