import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long n_div_max = n/b;

        long base = 1;
        long res = 0;
        while(base<=n_div_max+1){
            long x = b*base - 1;
            if(x>n)x=n;
            long floor_xB = base-1;
            long floor_AxB = (a*x)/b;
            res = Math.max(res, floor_AxB-a*floor_xB);
            base++;
        }

        System.out.println(res);

    }
}
