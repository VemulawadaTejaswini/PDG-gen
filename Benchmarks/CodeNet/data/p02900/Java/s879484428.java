import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long wk_no = a < b ? a : b;
        int cont = 0;
       
        for(long i = 1 ;i <= wk_no ; i++){
            if(a%i == 0 && b%i == 0){
                if(is_prime(i)) cont ++;
            }
        }
        
        System.out.println(cont);
        sc.close();
    }
    static boolean is_prime(long n) {
        if(n == 1) return true;
        for(long i = 2; i*i <= n; ++i) { // 2 <= i <= sqrt(n) に約数があれば、
            if(n % i == 0) return false; // n は素数ではない
        }
        return true;
    }
}

