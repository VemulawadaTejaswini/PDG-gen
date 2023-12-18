
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int count = 1;

        //AとBの大公約数を求める
        long gcdAB = Main.gcd(A, B);

        for(int i = 2 ; i <= gcdAB; i++){

            while(gcdAB % i == 0){
                count ++;
                gcdAB /= i;
            }
        }

        System.out.println(count);

    }

    //gcd  = greateset common divisor
    public static long gcd(long A, long B){
        if(B == 0) return A;
        else return gcd(B, A % B);
    }




}





