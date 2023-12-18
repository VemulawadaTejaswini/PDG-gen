import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        BigInteger nk = BigInteger.valueOf(n / k);
        BigInteger nk2 = BigInteger.valueOf(n / 2);
        BigInteger nk3 = BigInteger.valueOf((n / 2) + 1);
        BigInteger nk4 = BigInteger.valueOf((n / k) + 1);
        if(k % 2 != 0){
            System.out.println(nk.pow(3));
        }else{
            if(k - (k / 2) == 1){
                if(n % 2 == 0){
                    System.out.println(nk.pow(3).add(nk2.pow(3)));
                }else{
                    System.out.println(nk.pow(3).add(nk3.pow(3)));
                }
            }else{
                if(n - ((n / k) * k) >= k / 2){
                    System.out.println(nk.pow(3).add(nk4.pow(3)));
                }else{
                    System.out.println(nk.pow(3).add(nk.pow(3)));
                }
            }
        }
    }
}