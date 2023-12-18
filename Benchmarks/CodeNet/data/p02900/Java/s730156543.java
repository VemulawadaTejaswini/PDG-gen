import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long x = gcd(a,b);

        int count = 0;
        for(long i = 2;i <= x/2;i++){
            if(x%i==0&&isPrime(i)){
                count++;
            }
        }

        if(isPrime(x)){
            count++;
        }
        

        count++;

        System.out.println(count);
    }

    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }

    static boolean isPrime(long n)
    {
        if(n == 1){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}