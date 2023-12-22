import java.lang.reflect.Array;
import java.util.*;
import java.io.* ;
/*
NOTES:
-more than 10 digits (10^10), use long
-prefix sum of 1's and -1's to control flow of highlighting a region
-log(a)/log(b) = log base b of a
-create a position array if trying to see if elements show up next to each other sequentially
 i.e. elements 1,2,3 are within 3 spots of each other in an array
      arr[scannedInt - 1] = i; (position of i at p[i] in original)
- use a freq array when counting instances of an element occurring
- increment the counter first before simulating anything turn-based (two player game)

 */

public class Main {
    static long mod = (long)(Math.pow(10, 9) + 7);
    public static String alpha = "zabcdefghijklmnopqrstuvwxy";
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        long t = 1;
        while (t-- > 0){
            int n = scan.nextInt();
            long prod =1;
            long[] arr = new long[n];
            boolean hasZero = false;
            for(int i = 0;i<n; i++){
                arr[i] = scan.nextLong();
                if(arr[i] == 0) hasZero = true;
            }
            if(hasZero) {
                System.out.println(0);
                return;
            }
            for(int i = 0; i<n; i++){
                if(arr[i] <= (long)Math.pow(10,18)/prod) prod *= arr[i];
                else{
                    System.out.println(-1);
                    return;
                }
            }

            System.out.println(prod);

        }
        scan.close();

    }


    static boolean isPalindrome(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    static ArrayList factors(int n ){
        ArrayList<Integer> facts = new ArrayList<>();
        for(int i = 1; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0){
                if( i == Math.sqrt(n)) facts.add(i);
                else{
                    facts.add(i);
                    facts.add(n/i);
                }
            }
        }
        Collections.sort(facts);
        return facts;
    }

    static boolean isPrime (int n){
        if(factors(n).size() ==2) return true;
        else return false;
    }





    static long GCD(long a, long b) {
        // Everything divides 0
        if (a == 0) return b;
        if (b == 0) return a;

        // base case
        if (a == b) return a;

        // a is greater
        if (a > b) return GCD(a-b, b);
        return GCD(a, b-a);
    }
    static long LCM(long a, long b){
        return (a*b)/(GCD(a,b));
    }
    static String rev(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i<(s.length()+1)/2; i++){
            char temp = arr[i];
            arr[i] = arr[s.length()-i-1];
            arr[s.length()-i-1] = temp;
        }
        String fin = new String(arr);
        return fin;
    }
    static long pow(long a, long N) {
        if (N == 0) return 1;
        else if (N == 1) return a;
        else {
            long R = pow(a,N/2);
            if (N % 2 == 0) {
                return R*R;
            }
            else {
                return R*R*a;
            }
        }
    }

    static long powMod(long a, long N) {
        if (N == 0) return 1;
        else if (N == 1) return a % mod;
        else {
            long R = powMod(a,N/2) % mod;
            R *= R;
            R %= mod;
            if (N % 2 == 1) {
                R *= a;
                R %= mod;
            }
            return R % mod;
        }
    }

}