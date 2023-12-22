import java.util.*;
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();

        long mod = (long) Math.pow(10, 9) + 7;
        long all = powmod(10, s, mod);
        long notexist0 = powmod(9, s, mod);
        long notexist9 = powmod(9, s, mod);
        long notexistBoth = powmod(8, s, mod);
        long notexistOne = (notexist0 + notexist9 - notexistBoth);
        long total = (all - notexistOne) % mod;
      	
      	if(total >=0){
          System.out.println(total);
        }else{
          System.out.println(0);
        }

    }

    public static long powmod(long x, long y, long mod) {
        long total = 1;
        for (int i = 0; i < y; i++) {
            total = (total*x) % mod;
        }
        return total;
        
    }
}