import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lmax = -1;
        int rmin = Integer.MAX_VALUE;

        for(int i = 0;i < m;i++){
            lmax = Math.max(lmax, sc.nextInt());
            rmin = Math.min(rmin, sc.nextInt());
        }

        if(lmax > rmin) {
            System.out.println("0");
        } else {
            System.out.println(rmin-lmax+1);
        }
    }
}