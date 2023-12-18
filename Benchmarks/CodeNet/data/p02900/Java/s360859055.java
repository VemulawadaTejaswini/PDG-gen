import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(solve(a,b));
    }

    public static long solve(long a, long b){
        long gcd = gcd(a,b);
        if(gcd==1) return 1;

        int result = 1;
        setPrimeList(gcd);
        for(int i : primeList){
            if(gcd % i == 0){
                result++;
            }
        }
        return result;
    }

    public static long gcd (long x, long y){
        if(x<y) gcd(y,x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }

    public static List<Integer> primeList;
    public static int maxSearchIdx = 0;

    public static void setPrimeList(long n){
        primeList = new ArrayList<>((int)Math.sqrt(n));
        primeList.add(2);
        for(int i = 3; i <= n; i++){
            addToPrimeList(i);
        }
    }

    public static void addToPrimeList(int i){
        while(Math.sqrt(i) >= primeList.get(maxSearchIdx)){
            maxSearchIdx++;
        }
        for(int j=0; j<=maxSearchIdx; j++){
            if(i % primeList.get(j) == 0)
                return;
        }
        primeList.add(i);
    }
}