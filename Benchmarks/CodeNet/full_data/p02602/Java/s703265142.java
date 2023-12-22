import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static String toFour(int x){
		String S = Integer.toString(x, 4);
		for(int i = S.length(); i <= 7; i++){
			S = "0" + S;
		}
		return S;
	}
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int K = s.nextInt();
	int[] A = new int[N];
	for(int i = 0; i < N; i++){
		A[i] = s.nextInt();
	}

	for(int i = K; i < N; i++){
		if(A[i-K] < A[i]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
  }
}