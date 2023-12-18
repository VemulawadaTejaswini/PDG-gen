import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
	    long[] A = nextLongArray(sc, X);
	    long[] B = nextLongArray(sc, Y);
	    long[] C = nextLongArray(sc, Y);
	    long[] result = new long[X * Y * Z];
	    int i = 0;
	    for (long a : A) {
	        for (long b : B) {
	            for (long c : C) {
	               result[i] = a + b + c; 
	               i++;
	            }
	        }
	    } 
	    
	    Arrays.sort(result);
	    
	    for(int j = result.length - 1; j >= result.length - K; j--) {
	        System.out.println(result[j]);
	    }

	}
	
	public static long[] nextLongArray(Scanner sc, int num) {
	    long[] array = new long[num];
		for(int i = 0; i < num; i++) {
		    array[i] = sc.nextLong();
		}
		return array;
	}
	
// 	public static void printArray(long[] array) {
// 	    for(long a : array) {
// 	        System.out.println(a);
// 	    }
// 	}
}
