import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(solve(array));
    }

    public static long solve(int[] array){
        BigInteger sum = new BigInteger("0");
        BigInteger modulo = new BigInteger("1000000007");
        BigInteger product = new BigInteger("1");
        if(array.length == 1){
            return array[0];
        }
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                product = (new BigInteger(String.valueOf(array[i]))).multiply(new BigInteger(String.valueOf(array[j])));
                sum = sum.add(product);
            }
        }
        BigInteger result = sum.mod(modulo);
        return Long.parseLong(result.toString());
    }
}