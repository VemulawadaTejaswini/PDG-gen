import java.util.*;
import java.lang.*;

class PrimeNum {
    static boolean isPrime(int x) {
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int flag = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while(flag < n) {
            map.put(sc.nextInt(), 1);
            flag++;
        }

        int sum = 0;
        for(int key : map.keySet()) {
            if(isPrime(key)) sum++;
        }
        System.out.println(sum);
    }
}