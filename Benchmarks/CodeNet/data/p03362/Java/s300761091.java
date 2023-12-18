import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPrime(int p){
    	if(p%2==0) return false;
    	for(int i=3;i*i<=p;i+=2){
    		if(p%i==0) return false;
    	}
    	return true;
    }
    public static void arrayPrint(int[] array){
    	for(int i=0;i<array.length-1;i++) System.out.print(array[i]+" ");
    	System.out.println(array[array.length-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] primes = new int[N];
        int written = 0;
        for(int k=1;k<=5555;k++){
        	if(isPrime(10*k+1)){
        		primes[written]=10*k+1;
        		written++;
        	}
        	if(written>=N) break;
        }
        arrayPrint(primes);
    }
}