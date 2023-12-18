import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static int twoCount(int a){
		int count = 0;
		while(a%2 == 0){
			a = a/2;
			count++;
		}
		return count;
	}

	private static int calcGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }

    private static int calcLcm(int m, int n) {
        return m * n / calcGcd(m, n);
    }
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int M = s.nextInt();
	int[] A = new int[N];
	for(int i = 0; i < N; i++){
		A[i] = s.nextInt()/2;
	}

	boolean isExist = true; 
	for(int i = 0; i < N-1; i++){
		if(twoCount(A[i]) != twoCount(A[i+1])) isExist = false;
	}
	

	if(isExist){
		int maxLcm = A[0];
		for(int i = 0; i < N; i++){
			maxLcm = calcLcm(A[i], maxLcm);
		}
		System.out.println((M/maxLcm+1)/2);
	}else{
		System.out.println(0);
	}
    
  }
}