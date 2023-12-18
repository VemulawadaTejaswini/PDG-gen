
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int n = 1;
        int count = 0;
        long a=  A;
        long b = B;

        //優先度付きキュー（プライオリティキュー）の定義、最小のモナから取り出される
        PriorityQueue<Long> pq = new PriorityQueue<Long>();

        for(long i = 2; Math.min(a,b) / 2 >= i; i++){
            if(A % i == 0 && B % i == 0){
                pq.add(i);
                count ++;
                A = A / i;
                B = B / i;
            }
        }

        for(int i = 0; i < count; i++){
            if(isPrime(pq.poll())){
                n ++;
            }

        }



        System.out.println(n);

    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2)
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





