
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int count = 1;

        //AとBの大公約数を求める
        long gcdAB = Main.gcd(A, B);

        for(int i =2 ; i <= gcdAB; i++){
            if(gcdAB % i == 0 && isPrime(i)){
                count ++;
            }
        }

        System.out.println(count);

    }

    //gcd  = greateset common divisor
    public static long gcd(long A, long B){
        if(B == 0) return A;
        else return gcd(B, A % B);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く
    
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2)
        {
            if (num % i == 0)
            {
                // 素数ではない
                return false;
            }
        }
    
        // 素数である
        return true;
    }


}





